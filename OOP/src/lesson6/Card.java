package lesson6;

public class Card {
	//ジョーカー
	public static final int JOKER = 0;
	//スペード
	public static final int SUIT_SPADE = 1;
	//ダイヤ
	public static final int SUIT_DIAMOND = 2;
	//クラブ
	public static final int SUIT_CLUB = 3;
	//ハート
	public static final int SUIT_HEART = 4;
	//カードの示すスート
	private int suit_;
	//カードの示す数
	private int number_;
	
	public Card(int suit, int number) {
		this.suit_ = suit;
		this.number_ = number;
	}
	
	//数字を見る
	public int getNumber() {
		return number_;
	}
	
	//カードを文字列で表現
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		if (number_ > 0) {
			switch (suit_) {
				case SUIT_SPADE :
					string.append("S");
					break;
					
				case SUIT_DIAMOND :
					string.append("D");
					break;
					
				case SUIT_CLUB :
					string.append("C");
					break;
					
				case SUIT_HEART :
					string.append("H");
					break;
					
				default :
					break;
			}
			
			switch (number_) {
				case 1 :
					string.append("A");
					break;
					
				case 10 :
					string.append("T");
					break;
					
				case 11 :
					string.append("J");
					break;
					
				case 12 :
					string.append("Q");
					break;
				case 13 :
					string.append("K");
					break;
					
				default :
					string.append(number_);
					break;
			}
		} else {
			//ジョーカー
			string.append("JK");
		}
		
		return string.toString();
	}
	
}
