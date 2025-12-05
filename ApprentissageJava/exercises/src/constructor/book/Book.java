package constructor.book;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
	}
	
	public Book(final String title, final String author) {
		this.title = title;
		this.author = author;
		this.price = 0.0;
	}
	
	public Book(final String title, final String author, final double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public static void main(String[] args) {
		Book myBook = new Book("Le mage du Kremlin", "Giuliano da Empoli", 26.9);
		System.out.println("Titre du livre : " + myBook.getTitle());
		System.out.println("Nom de l'auteur : " + myBook.getAuthor());
		System.out.println("Prix du livre : " + myBook.getPrice() + " CHF");
	}
	
	
}
