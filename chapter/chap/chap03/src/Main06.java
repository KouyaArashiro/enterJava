public class Main06 {

	public static void main(String[] args) {
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		int num;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			num = new java.util.Scanner(System.in).nextInt();
			
			if(num == ans) {
				System.out.println("アタリ");
				break;
			} else {
				System.out.println("ハズレ");	
			}
		}
		
		System.out.println("終了");
		
	}

}
