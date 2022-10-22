package chap08;

import java.util.Random;

public class Cleric {
	String name;
	int hp;
	int mp;
	final int MAXHP = 50;
	final int MAXMP = 10;
	
	
	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public void selfAid() {
		this.hp = MAXHP;
		this.mp -= 5;
		
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った");
		
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		
		return recoverActual;
	}

}
