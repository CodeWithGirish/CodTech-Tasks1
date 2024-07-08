import java.util.Comparator;

// Class to compare students based on different fields
public class StudentComparator implements Comparator<Student> {
	private String field; // Field to sort by
	
	// Constructor to set the field to sort by
	public StudentComparator(String field) {
		this.field = field;
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		switch(field) {
			case "name":
				return o1.getName().compareTo(o2.getName()); // Compare by name
			case "ID":
				return Integer.compare(o1.getID(), o2.getID()); // Compare by ID
			case "GPA":
				return Double.compare(o1.getGPA(), o2.getGPA()); // Compare by GPA
			case "email":
				return o1.getEmail().compareTo(o2.getEmail()); // Compare by email
			default:
				return 0; // Default case, no comparison
		}
	}
}
