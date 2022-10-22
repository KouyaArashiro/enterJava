package chap08;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("Arashiro", 200);
		h.sit(5);
		h.slip();
		h.sleep();
		h.sit(25);
		h.run();
		
		Matango m = new Matango('B', 5, 10);
		m.run();
	}

}
