package chap08;

public class Hero {
	private String name;
	private int hp;
	
	public Hero() {
		this("Hero");
	}
	public Hero(String name) {
		this.name = name;
		this.hp = 300;
	}
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullです。処理を中断します。");
		}
		
		if(name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎます。処理を中断します。");
		}
		
		this.name = name;
		
		
	}
	
	public void sleep() {
		this.hp += 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	
	public void sit(int sec) {
		this.hp += sec; 
		System.out.println(this.name + "は、座って" + sec + "回復した");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5のダメージ");
		
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは、" + this.hp + "でした");
		
	}

}
