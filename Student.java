public class Student {
	private String name;
	private String email;
	private int ID;
	private int age;
	private double GPA;
	
	// Constructor to initialize a new student
	public Student(String name, String email, int ID, int age, double GPA) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.GPA = GPA;
		this.email = email;
	}
	
	// Getter method for student's name
	public String getName() {
		return this.name;
	}
	
	// Getter method for student's email
	public String getEmail() {
		return this.email;
	}
	
	// Getter method for student's ID
	public int getID() {
		return this.ID;
	}
	
	// Getter method for student's GPA
	public double getGPA() {
		return this.GPA;
	}
	
	// Getter method for student's age
	public int getAge() {
		return this.age;
	}
	
	// Override toString method to provide a string representation of the student
	public String toString() {
		return "Name: " + name + "\nID: " + ID + "\nEmail: " + email + "\nGPA: " + GPA + "\n";
	}
	
}
