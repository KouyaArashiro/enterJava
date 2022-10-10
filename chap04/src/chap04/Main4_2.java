package chap04;

public class Main4_2 {

	public static void main(String[] args) {
		int [] moneyList = {121902, 8302, 55100};
		
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println("残高: " + moneyList[i]);
		}
		
		System.out.println("拡張for文");
		for(int amounts : moneyList) {
			System.out.println("残高: " + amounts);
			
		}
	}

}
