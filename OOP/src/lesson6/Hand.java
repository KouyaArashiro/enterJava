package lesson6;
import java.util.ArrayList;

public class Hand {
	//手札のにあるカードを格納する
	private ArrayList hand_ = new ArrayList();
	
	public void addCard(Card card) {
		hand_.add(card);
	}
	
	public Card pickCard() {
		Card pickedCard = (Card) hand_.remove(0);
		
		return pickedCard;
	}
	
	public void shuffle() {
		//手札の枚数を取得
		int number = hand_.size();
		
		//カードを抜き出す位置
		int pos;
		
		//カードをランダムに抜き取って最後に加える
		for (int count = 0; count < number * 2; count++) {
			//ランダムな位置からカードを１枚抜き取る
			pos = (int) (Math.random() * number);
			Card pickedCard = (Card) hand_.remove(pos);
			
			//抜き取ったカードを最後に加える
			hand_.add(pickedCard);
		}
	}
	
	//枚数を数える
	public int getNumberOfCards() {
		return hand_.size();
	}
	
	//同じ数のカードを探す
	//無い場合はnullを返す
	public Card[] findSameNumberCard() {
		int numberOfCards = hand_.size();
		Card[] sameCards = null;
		
		if (numberOfCards > 0) {
			//最後に追加されたカードを取得
			int lastIndex = numberOfCards - 1;
			Card lastAddedCard = (Card) hand_.get(lastIndex);
			
			//最後に追加されたカードの数を取得する
			int lastAddedCardNum = lastAddedCard.getNumber();
			
			for (int index = 0; index < lastIndex; index++) {
				Card card = (Card) hand_.get(index);
				if (card.getNumber() == lastAddedCardNum) {
					sameCards = new Card[2];
					sameCards[0] = (Card) hand_.remove(lastIndex);  
					sameCards[1] = (Card) hand_.remove(index);
					
					break;
				}
			}
		}
		
		return sameCards;
	}
	
	//手札にあるカードを文字列で表現する
	public String toString() {
		StringBuffer string = new StringBuffer();
		int size = hand_.size();
		if (size > 0) {
			for (int index = 0; index < size; index++) {
				Card card = (Card) hand_.get(index);
				string.append(card);
				string.append(" ");
			}
		}
		
		return string.toString();
	}
	
}
