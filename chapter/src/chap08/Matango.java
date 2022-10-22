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
	
	public void run() {
		System.out.println(this.suffix + "は、逃げ出した");
	}
	
	
	
}
