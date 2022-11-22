package chap11;

public class Main {

	public static void main(String[] args) {
		Computer c = new Computer("Think Pad", 1000000, "Black", "Mouse");
		Book b = new Book("Hacker and Artist", 1000, "White", "978-2222-434-222");
		
		System.out.println(c.getName());
		System.out.println(c.getPrice());
		System.out.println(c.getColor());
		System.out.println(c.getMakerName());
		
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		System.out.println(b.getIsbn());
	}

}
