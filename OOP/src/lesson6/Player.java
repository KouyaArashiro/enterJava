package lesson6;

public class Player {
	//進行役
	private Master master_;
	
	//テーブル
	private Table table_;
	
	//自分の手札
	private Hand myHand_ = new Hand();
	
	private String name_;
	
	public Player(String name, Master master, Table table) {
		this.name_ = name;
		this.master_ = master;
		this.table_ = table;
	}
	
	//順番を指名する
	public void play(Player nextPlayer) {
		Hand nextHand = nextPlayer.showHand();
		
		Card pickedCard = nextHand.pickCard();
		
		//引いた結果を表示
		System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました");
		
		//引いたカードを手札に加え、同じ数のカードがあったら捨てる
		dealCard(pickedCard);
		
		//手札が0になったか調べる
		if (myHand_.getNumberOfCards() == 0) {
			master_.decleareWin(this);
		} else {
			//現在の手札を表示する
			System.out.println(this + ":残りはの手札は" + myHand_ + "です");
		}
	}
	
	//手札を見せる
	public Hand showHand() {
		if (myHand_.getNumberOfCards() == 1) {
			master_.decleareWin(this)
		}
		
		//見せる前にシャッフルする
		myHand_.shuffle();
		
		return myHand_;
	}
	
	//カードを受け取る
	public void receiveCard(Card card) {
		//引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる
		dealCard(card);
	}
	
	//カードを自分の手札に加え、同じ数のカードがあったら捨てる
	private void dealCard(Card card) {
		myHand_.addCard(card);
		
		//加えたカードと同じカードを探す
		Card [] sameCards = myHand_.findSameNumberCard();
		if (sameCards != null) {
			System.out.print(this + ":");
			table_.disposeCard(sameCards);
		}
	}
	
	//プレイヤーの名前を返す
	public String toString() {
		return name_;
	}
}
