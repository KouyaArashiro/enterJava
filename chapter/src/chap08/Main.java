package chap08;

public class Main {

	public static void main(String[] args) {
//		Hero h1 = new Hero("Arashiro", 200);
//		Hero h2 = new Hero("Koo");
//		Hero h3 = new Hero();
		
		Thief t1 = new Thief("t1", 100, 100);
		Thief t2 = new Thief("t2", 100);
		Thief t3 = new Thief("t3");
		
		System.out.println(t1.name);
		System.out.println(t1.hp);
		System.out.println(t1.mp);
		System.out.println(t2.name);
		System.out.println(t2.hp);
		System.out.println(t2.mp);
		System.out.println(t3.name);
		System.out.println(t3.hp);
		System.out.println(t3.mp);
		
//		System.out.println(h1.name);
//		System.out.println(h1.hp);
//		System.out.println(h2.name);
//		System.out.println(h2.hp);
//		System.out.println(h3.name);
//		System.out.println(h3.hp);
		
//		Wizard w = new Wizard();
//		w.name = "wiz";
//		w.hp = 50;
//		
//		w.heal(h1);
//		w.heal(h2);
		
//		h1.sit(5);
//		h1.slip();
//		h1.sleep();
//		h1.sit(25);
//		h1.run();
//		
//		Matango m = new Matango('B', 5, 10);
//		m.run();
	}

}
