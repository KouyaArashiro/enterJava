package chap06;

public class Main6_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic.plus(a, b);
		int delta = CalcLogic.minus(a, b);
		
		System.out.println(a + "+" + b +  "=" + total);
		System.out.println(a + "-" + b +  "=" + delta);
	}

}
