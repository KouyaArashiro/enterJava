package chap05;

import java.util.Scanner;

public class Ensyu5_4 {

	public static void main(String[] args) {
		double bottom, height, radius;
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("求める三角形の底辺の長さを入力してください。[cm]");
		 bottom = scan.nextDouble();
		 System.out.println("求める三角形の高さの長さを入力してください。[cm]");
		 height = scan.nextDouble();
		 System.out.println("求める円の半径を入力してください。[cm]");
		 radius = scan.nextDouble();
		 
		System.out.println("底辺" + bottom + "cm、高さ" + height + "cmの三角形の面積は" +  calcTriangleArea(bottom, height) + "cm^2です。");
		System.out.printf("半径" + "%f" + "cmの円の面積は" + "%.3f"  + "cm^2です。", radius, calcCircleArea(radius));
		
		scan.close();
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	public static double calcCircleArea(double radius) {
		return radius * radius * Math.PI;
	}
	

}
