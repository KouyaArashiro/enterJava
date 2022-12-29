import java.util.Scanner;
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, max;
		
		System.out.println("３つの整数の最大値を求めます。");
		System.out.print("aの値: ");
		a = stdIn.nextInt();
		System.out.print("bの値: ");
		b = stdIn.nextInt();
		System.out.print("cの値: ");
		c = stdIn.nextInt();
		
		max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		System.out.println("最大値は" + max + "です");
		
		stdIn.close();
		
	}

}
