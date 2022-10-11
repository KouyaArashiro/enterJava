package chap05;

public class Main13 {

	public static void incArray(int [] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int [] array = {1, 2, 3};
		incArray(array);
		for(int elements : array) {
			System.out.println(elements);
		}
	}

}
