
public class Max4Method {

	public static void main(String[] args) {
		System.out.println("max3(4, 3, 2, 1) = " + max4(4, 3, 2, 1));
		System.out.println("max3(4, 3, 2, 1) = " + max4(4, 3, 2, 4));
		System.out.println("max3(4, 3, 2, 1) = " + max4(1, 3, 2, 4));
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = max3(a, b, c);
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		return max;
	}

}
