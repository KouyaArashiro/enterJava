package chap05;

import java.util.Scanner;

public class Ensyu5_1 {

	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("名前を入力してください");
		String name = scan.nextLine();
		
		System.out.println("年齢を入力してください");
		int age = scan.nextInt();
		
		System.out.println("身長を入力してください[cm]");
		double height = scan.nextInt();
		
		System.out.println("干支を入力してください[例：へび]");
		String zodiac = scan.nextLine();
		
		System.out.println("こんにちは" + name + "です");
		System.out.println(age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("干支は" + zodiac + "です");
		
		
		scan.close();
	}

}
