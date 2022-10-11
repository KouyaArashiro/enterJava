package chap04;

public class Main02 {

	public static void main(String[] args) {
		int [] scores = new int[5];
		int num = scores.length;
		int sum = 0;
		double avg = 0;
		
		//値の格納
		for(int i = 0; i < 5; i++) {
			scores[i] = 10 * i;
			System.out.println(scores[i]);
			sum += scores[i];
		}
		
		avg = sum / num;
		System.out.println("合計点: " + sum);
		System.out.println("平均点: " + avg);
//		System.out.println("要素の数: " + num);
	}

}
