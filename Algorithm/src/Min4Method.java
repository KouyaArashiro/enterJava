
public class Min4Method {

	public static void main(String[] args) {
		System.out.println("min3(3, 2, 1) = " + min4(4, 3, 2, 1));
		System.out.println("min3(3, 2, 2) = " + min4(2, 3, 2, 2));
		System.out.println("min3(3, 1, 2) = " + min4(3, 1, 2, 4));
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = min3(a, b, c);
		
		if(d < min) {
			min = d;
		}
		return min;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		return min;
	}

}
