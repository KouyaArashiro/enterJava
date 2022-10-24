package chap08;

public class SuperHero extends Hero {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着地した");
	}
	
	public SuperHero() {
		super();
	}
	public SuperHero(String name) {
		super(name);
	}
	public SuperHero(String name, int hp) {
		super(name, hp);
	}

}
