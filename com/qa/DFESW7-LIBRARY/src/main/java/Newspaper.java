
public class Newspaper extends LibraryItems implements Readable {

	private static String Publisher;
	private static String DatePublished;

	public Newspaper(String publisher, String datePublished) {
		super();
		Publisher = publisher;
		DatePublished = datePublished;
	}

	public String getPublisher() {
		return Publisher;
	}

	public static void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getDatePublished() {
		return DatePublished;
	}

	public static void setDatePublished(String datePublished) {
		DatePublished = datePublished;
	}

	@Override
	public String toString() {
		return "Newspaper Publisher = " + Publisher + ", DatePublished = " + DatePublished + ", ID = " + getID();
	}

	public void readable() {
		// TODO Auto-generated method stub
		System.out.println("A Newspaper is readable");

	}

}
