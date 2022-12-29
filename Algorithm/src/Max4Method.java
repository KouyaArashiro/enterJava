
public class Max4Method {

	public static void main(String[] args) {
		System.out.println("max3(4, 3, 2, 1) = " + max4(4, 3, 2, 1));
		System.out.println("max3(4, 3, 2, 1) = " + max4(4, 3, 2, 4));
		System.out.println("max3(4, 3, 2, 1) = " + max4(1, 3, 2, 4));
//		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
//		System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
//		System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
//		System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
//		System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
//		System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3));
//		System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
//		System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
//		System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
//		System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
//		System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
//		System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
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
