
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItems bookOne = new Book("Lord Of The Rings", "J.R.R Tolkien");
		LibraryItems newspaperOne = new Newspaper("The Sun", "12/02/2018");
		LibraryItems dissertationOne = new Dissertation("Caitriona", "History of Art");

//		System.out.println(bookOne);
//		System.out.println(newspaperOne);
//		System.out.println(dissertationOne);

		Library.addItem(dissertationOne, bookOne, newspaperOne);
//		libraryFunctions.print();
//		libraryFunctions.updateItem(bookOne, "Twin Towers", "J.R.R Tolkein");
//
//		Person personOne = new Person(false, "Jack");
		Person personOne = new Person(true, "Caitriona");
		Library.registerPerson(personOne);
		Library.checkOut(bookOne, personOne);
		System.out.println(Library.checkedOut);
//		libraryFunctions.print();
		Library.checkIn(bookOne, personOne);

	}

}
