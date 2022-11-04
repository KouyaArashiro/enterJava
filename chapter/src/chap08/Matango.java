package chap08;

public class Matango {
	char suffix;
	int hp;
	int level;
	
	public Matango(char suffix, int hp, int level) {
		this.suffix = suffix;
		this.hp = hp;
		this.level = level;
	}
	public Matango(char suffix, int hp) {
		this(suffix, hp, 10);
	}
	public Matango(char suffix) {
		this(suffix, 10, 10);

	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	
	public void run() {
		System.out.println(this.suffix + "は、逃げ出した");
	}
	
	
	
}
