package chap04;

public class Main4_4 {

	public static void main(String[] args) {
		int [] numbers = {3, 4, 9};
		int correct = 0;
		
		System.out.println("1桁の数字を入力してください");
		
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			if(input == numbers[i]) {
				System.out.println("アタリ!");
				correct++;
				break;
			}
		}
		
		if(correct < 1) {
			System.out.println("ハズレ");
		}
	}

}
