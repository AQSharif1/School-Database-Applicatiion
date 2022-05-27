import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student  {
	Scanner scanner = new Scanner(System.in);
	List<Person> students;
	String schoolName;
	private int studentID;
	
	
	public Student() {
		students = new ArrayList<Person>();
	}
	
	public boolean addStudent(String name, int age) {
		Person newStudent = new Person(name,age);
		for(int i = 0; i<students.size(); i++) {
		if(students.get(i).getName().equalsIgnoreCase(newStudent.getName())) {
			System.out.println(name + ", Already in List\n");
			return true;
			}
		}
		students.add(newStudent);
		System.out.println(name + ", added. \n");
		return false;
		
	}
	
	public boolean removeStudent(String name, int age) {
		for(Person newStudent: students) {
			if(newStudent.getName().equalsIgnoreCase(name)) {
				students.remove(newStudent);
				System.out.println(name + ", Removed.\n");
				return true;
		}
	}
		System.out.println("Student not in List. ");
		return false;
	}
	
	public int findStudent() {
		System.out.println("Enter name of student: ");
		String studentName = scanner.nextLine();
		scanner.nextLine();
		for (int i = 0; i < students.size(); i++ ) {
			 {
				if(students.get(i).getName().equalsIgnoreCase(studentName)) {
					System.out.println("Found. " + studentName + " in position: " + i);
					return i;
				}
			}
		}
		System.out.println(" Student Not in List.");
		return -1;
		
	}
	
	
	public void studentList() {
		System.out.println("************************************************");
	System.out.println("List \n");
		for(int i = 0; i< students.size(); i++) {
			System.out.println("Name: " + students.get(i).getName() +"\nage: " + students.get(i).getAge() + "\n");
		}
		
		if(students.size()<=0) {
			System.out.println("List is Empty!");
		}
		System.out.println("*************************************************");
	}
	
	
	
}