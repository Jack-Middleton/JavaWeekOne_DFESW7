public abstract class LibraryItems {

	private int ID;
	private static int count;

	public LibraryItems() {
		// TODO Auto-generated constructor stub
		count++;
		ID = count;
	}

	public int getID() {
		return ID;
	}

}
