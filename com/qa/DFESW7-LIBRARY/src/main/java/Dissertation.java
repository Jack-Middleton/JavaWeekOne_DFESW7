
public class Dissertation extends LibraryItems implements Readable {

	private static String Student;
	private static String Subject;

	public Dissertation(String student, String subject) {
		super();
		Student = student;
		Subject = subject;
	}

	public String getStudent() {
		return Student;
	}

	public static void setStudent(String student) {
		Student = student;
	}

	public String getSubject() {
		return Subject;
	}

	public static void setSubject(String subject) {
		Subject = subject;
	}

	@Override
	public String toString() {
		return "Dissertation: Student = " + Student + ", Subject = " + Subject + ", ID = " + getID();
	}

	public void readable() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

}
