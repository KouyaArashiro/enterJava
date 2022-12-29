import java.util.Scanner;
public class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, min;
		
		System.out.println("３つの整数の最小値を求めます。");
		System.out.print("aの値: ");
		a = stdIn.nextInt();
		System.out.print("bの値: ");
		b = stdIn.nextInt();
		System.out.print("cの値: ");
		c = stdIn.nextInt();
		
		min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		System.out.println("最小値は" + min + "です");
		
		stdIn.close();
		
	}

}