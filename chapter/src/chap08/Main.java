package chap08;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("Arashiro", 200);
		Hero h2 = new Hero();
		Wizard w = new Wizard();
		w.name = "wiz";
		w.hp = 50;
		
		w.heal(h1);
		w.heal(h2);
		
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
