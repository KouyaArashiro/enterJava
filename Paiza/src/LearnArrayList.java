import java.util.Random;

public class LearnArrayList {
	public static void main(String[] args) {
//		ArrayList<Integer> data = new ArrayList<Integer>();
//		ArrayList result = new ArrayList();
		
		int [] answerData = new int [10];
		int [] resultData = new int [10];
		
		Random rand = new Random();
		
		//解答データと結果データの格納
		for(int i = 0; i < answerData.length; i++) {
			answerData[i] = rand.nextInt(100);
//			System.out.println(answerData[i]);
		}
		
		for(int i = 0; i < resultData.length; i++) {
			resultData[i] = i * 10;
		}
		
		//入力データの確認
		for(int answer : answerData) {
			System.out.printf("%3d", answer);
		}
		System.out.println();
		for(int result : resultData) {
			System.out.printf("%3d", result);
		}
		
		
	}
}
