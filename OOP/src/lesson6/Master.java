package lesson6;

import java.util.ArrayList;

public class Master {
	private ArrayList players_ = new ArrayList();
	
	public void prepareGame(Hand cards) {
		System.out.println("カードを配ります");
		
		cards.shuffle();
		
		//トランプの枚数を取得
		int numberOfCards  =cards.getNumberOfCards();
		
		//プレイヤーの人数を取得する
		int numberOfPlayers = players_.size();
		
		for(int index = 0; index < numberOfCards; index++) {
			//カードから１枚引く
			Card card = cards.pickCard();
			
			//各プレイヤーに順番にカードを配る
			Player player = (Player) players_.get(index % numberOfPlayers);
			player.receiveCard(card);
		}
	}
	
	//ゲームを開始する
	public void startGame() {
		System.out.println("\n ゲームを開始します");
		
		//プレイヤーの人数を取得する
		for(int count = 0; players_.size() > 1; count++) {
			int PlayerIndex = count % players_.size();
			int nextPlayerIndex = (count + 1) % players_.size();
			
			//指名するプレイヤーの取得
			Player player = (Player) players_.get(PlayerIndex);
			
			//次のプレイヤーの取得
			Player nextPlayer = (Player) players_.get(nextPlayerIndex);
			
			//プレイヤーを指名する
			System.out.println("\n" + player + "さんの番です");
			player.play(nextPlayer);
		}
		
		//プレイヤーが一人になった場合
		System.out.println("ババ抜きを終了しました");
	}
	
	//上がりを宣言する
	public void decleareWin(Player winner) {
		System.out.println(winner + "さんが上がりました");
		
		//上がったプレイヤーをリストから外す
		players_.remove(players_.indexOf(winner));
		
		//残りのプレイヤーが一人になった場合は敗者を表示する
		if(players_.size() == 1) {
			Player loser = (Player) players_.get(0);
			System.out.println(loser + "さんの負けです");
			
		}
	}
	
	//参加するプレイヤー
	public void registerPlayer(Player player) {
		players_.add(player);
	}
}
