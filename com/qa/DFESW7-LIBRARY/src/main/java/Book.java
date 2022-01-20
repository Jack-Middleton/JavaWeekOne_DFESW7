
public class Book extends LibraryItems implements Readable {
	private static String Title;
	private static String Author;

	public Book(String title, String author) {
		super();
		Title = title;
		Author = author;
	}

	public String getAuthor() {
		return Author;
	}

	public static void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return Title;
	}

	public static void setTitle(String title) {
		Title = title;
	}

	@Override
	public String toString() {
		return "Book Title = " + Title + ", Author = " + Author + ", ID = " + getID();
	}

	public void readable() {
		// TODO Auto-generated method stub
		System.out.println("A book is readable");
	}

}
