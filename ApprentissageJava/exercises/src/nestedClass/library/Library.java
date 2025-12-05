package nestedClass.library;

public class Library {
	private String libraryName;
	
	public Library(String libraryName) {
		this.libraryName = libraryName;
	}
	
	public class Book {
		public String getLibraryName() {
			return libraryName;
		}
	}
	
	public static void main(String[] args) {
		Library library = new Library("London Library");
		Library.Book book = library.new Book();
		
		System.out.println("Library name: " + book.getLibraryName());
	}
}
