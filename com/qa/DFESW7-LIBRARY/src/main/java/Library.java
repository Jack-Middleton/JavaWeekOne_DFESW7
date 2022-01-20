import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map;

public abstract class Library implements Librarian {

	static ArrayList<LibraryItems> items = new ArrayList<LibraryItems>();
	static ArrayList<Person> register = new ArrayList<Person>();
	static HashMap<LibraryItems, Person> checkedOut = new HashMap<LibraryItems, Person>();

	public static void print() {
		for (Object item : items) {
			System.out.println(item);
		}
	}

	// overloading addItem so that i can add a number of objects to the Array at the
	// same time, up to 3
	public static void addItem(LibraryItems... i) {
		items.addAll(Arrays.asList(i));

	}

	public static void removeItem(LibraryItems i) {

		for (LibraryItems item : new ArrayList<LibraryItems>(items)) {
			if (item.equals(i)) {
				items.remove(i);
			}
		}

	}

	// updates the item in the list, where string x is the first value of the
	// classes constructor
	// and y is the second value
	public static void updateItem(LibraryItems i, String x, String y) {
		for (Object item : items) {
			if (item instanceof Book) {
				if (item.equals(i)) {
					Book.setTitle(x);
					Book.setAuthor(y);
				}
			}
			if (item instanceof Newspaper) {
				if (item.equals(i)) {
					Newspaper.setPublisher(x);
					Newspaper.setDatePublished(y);
				}
			}
			if (item instanceof Dissertation) {
				if (item.equals(i)) {
					Dissertation.setStudent(y);
					Dissertation.setSubject(y);
				}
			}
		}
	}

	// iterates through the HashMap, gets both the key and its value (in this case
	// the item and the person who checked it out
	// and then removes them using it.remove(); to avoid a
	// concurrentModificationException

	public static void checkIn(LibraryItems l, Person p) {
		// TODO Auto-generated method stub
		for (HashMap.Entry<LibraryItems, Person> pairings : checkedOut.entrySet()) {
			Iterator it = checkedOut.entrySet().iterator();
			while (it.hasNext()) {
				HashMap.Entry pair = (HashMap.Entry) it.next();
				System.out.println(pair.getKey() + " = " + pair.getValue());
				it.remove();
				items.add(l);
			}
		}
	}

	public static void checkOut(LibraryItems i, Person p) {
		// TODO Auto-generated method stub
		if (p.isHasLibraryCard() == true) {
			for (LibraryItems item : new ArrayList<LibraryItems>(items)) {
				if (item.equals(i)) {
					items.remove(i);
					checkedOut.put(i, p);
				}
			}

		} else {
			System.out.println("Cannot be checked out, user does not own a library card");
		}
	}

	public static void registerPerson(Person... p) {
		// TODO Auto-generated method stub
		register.addAll(Arrays.asList(p));
	}

	public static void updatePerson(Person i, boolean x, String y) {
		// TODO Auto-generated method stub
		for (Person person : register) {
			if (person.equals(i)) {
				Person.setName(y);
				Person.setHasLibraryCard(x);
			}
		}
	}

	public static void deletePerson(Person i) {
		// TODO Auto-generated method stub
		for (Person person : new ArrayList<Person>(register)) {
			if (person.equals(i)) {
				register.remove(i);
			}
		}
	}

}
