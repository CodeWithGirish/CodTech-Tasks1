import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

// Main class
public class Main {
	
	// List to hold student objects
	private static ArrayList<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		boolean shouldRun = true; 
		
		
		while (shouldRun) {
			System.out.println("Enter a command (add, search, sort, view, exit): ");
			String command = input.nextLine();
			
			switch (command) {
				case "add":
					addStudent(input); // Call addStudent method
				break;
				case "search":
					searchStudents(input); // Call searchStudents method
				break;
				case "sort":
					sortStudents(input); // Call sortStudents method
				break;
				case "view":
					viewStudents(); // Call viewStudents method
				break;
				case "exit":
					shouldRun = false; //Exit the loop
				break;
				default:
					System.out.println("Invalid Command");
				break;
			}
		}

	}
	
	// Method to add a student
	private static void addStudent(Scanner input) {
		System.out.println("Enter the student name: ");
		String name = input.nextLine(); // Read student name
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the student ID: ");
		int ID = input.nextInt(); // Read student ID
		input.nextLine();
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the student email: ");
		String email = input.nextLine(); // Read student email
		
		// Email Validation
		while (!isValidEmail(email)) {
			System.out.println("Wrong email, try again: ");
			email = input.nextLine(); 
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the student GPA: ");
		double GPA = input.nextDouble(); // Read student GPA
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the student age: ");
		int age = input.nextInt(); // Read student age
		
		input.nextLine();
		System.out.println("-----------------------------------------------");
		// Create a new Student object and add it to the list
		Student newStudent = new Student(name, email, ID, age, GPA);
		students.add(newStudent);
		
		System.out.println("Student added successfully");
		
	}
	
	// Method to validate email format using regex
	private static boolean isValidEmail(String email) {
	    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(email);
	    return matcher.find();
	}
	
	// Method to search students by name
	private static void searchStudents(Scanner input) {
		System.out.println("Enter the student name: ");
		String name = input.nextLine(); // Read student name
		
		// Iterate through the list and print matching students
		for (Student student: students) {
			if(student.getName().equals(name)) {
				System.out.println(student);
			}
		}
	}

	// Method to sort students by specified field
	private static void sortStudents(Scanner input) {
		System.out.println("Enter a field to sort by (name, ID, email, or GPA): ");
		String field = input.nextLine(); // Read field to sort by
		
		// Sort the students list using a custom comparator
		Collections.sort(students, new StudentComparator(field));
		
		// Print sorted students
		for (Student student: students) {
			System.out.println(student);
		}
	}
	
	// Method to view all students
	private static void viewStudents() {
		// Iterate through the list and print all students
		for (Student student: students) {
			System.out.println(student);
		}
	}
	
}
