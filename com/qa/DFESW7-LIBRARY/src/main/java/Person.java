public class Person {
	private static boolean HasLibraryCard;
	private static String Name;

	public Person(boolean hasLibraryCard, String name) {
		super();
		HasLibraryCard = hasLibraryCard;
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public static void setName(String name) {
		Name = name;
	}

	public boolean isHasLibraryCard() {
		return HasLibraryCard;
	}

	public static void setHasLibraryCard(boolean hasLibraryCard) {
		HasLibraryCard = hasLibraryCard;
	}

	@Override
	public String toString() {
		if (HasLibraryCard == true) {
			return "name = " + Name + ", has a library card";
		} else {
			return "name = " + Name + ", does not have a library card";
		}

	}

}
