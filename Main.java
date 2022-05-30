import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static School m = new School("Meadow Park");

	public static void main(String[] args) {
		boolean quit = false;
		int choice;
		/*
		 * //Student sList = new Student(); School m = new School("MEadow"); Student s =
		 * new Student("Dave", 18, 24432);
		 * 
		 * 
		 * sList.addStudent("Mike" , 10); sList.addStudent("Mike", 10);
		 * sList.addStudent("Dave", 20); sList.studentList();
		 * 
		 * sList.removeStudent("Mike", 10);
		 * 
		 * sList.studentList();
		 * 
		 * m.addStudentList(sList);
		 * 
		 * 
		 * //adding students m.addStudent("Mike" , 10 , 2435); m.addStudent(s);
		 * 
		 * //Adding Teachers m.addTeacher("Nancy", 30, 0223, "Math");
		 * m.addTeacher("Abdul", 24,007, "Hoodology");
		 * 
		 * 
		 * //list print m.studentList(); m.teacherList();
		 * 
		 * //removing student m.removeStudent(s);
		 * 
		 * //list print m.studentList();
		 * 
		 */
		menu();
		
		while (!quit) {
			System.out.println("\nMake a choice? ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				addStudent();
				break;
			case 2:
				addTeacher();
				break;
			case 3:
				removeStudent();
				break;
			case 4:
				removeTeacher();
				break;
			case 5:
				printStudents();
				break;
			case 6:
				printTeachers();
				break;
			case 7:
				menu();
				break;
			case 0:
				quit = true;
				break;
			}
		}
	}

	public static void menu() {
		System.out.println("1--> Add Student");
		System.out.println("2-->Add Teacher");
		System.out.println("3-->Remove Student");
		System.out.println("4-->Remove Teacher");
		System.out.println("5-->Print Students");
		System.out.println("6-->Print Teachers");
		System.out.println("7-->Menu");
		System.out.println("0-->Quit");
	}

	public static void addStudent() {
		System.out.println("Enter Student Name.");
		String name = scanner.nextLine();
		
		System.out.println("Enter Age");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Student ID");
		int id = scanner.nextInt();

		Student newStudent = new Student(name, age, id);
		if(m.addStudent(newStudent)) {
			System.out.println("Student: " + name + " added.");
		}else
		System.out.println("Student already in List");
	}

	public static void addTeacher() {
		System.out.println("Enter Teacher Name.");
		String name = scanner.nextLine();
		
		System.out.println("Enter Age");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Teacher ID");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Teaches what subject");
		String teaches = scanner.nextLine();
		
		Teacher newTeacher = new Teacher(name, age, id,teaches);
		if(m.addTeacher(newTeacher)) {
			System.out.println("Teacher: " + name + " added.");
		}else
		System.out.println("Teacher already in List");
	}

	
	//multi way to code remove, thru main or method in other class and call it
	public static void removeStudent() {
		System.out.println("Enter student id");
		int u = scanner.nextInt();
		scanner.nextLine();
//		
//		for(int i = 0; i< m.getStudents().size(); i++) {
//			if(m.getStudents().get(i).getId() == u) {
//				System.out.println("Student " + m.getStudents().get(i).getName() + " removed" );
//				m.getStudents().remove(i);
//				
//				return;
//			}
//		}
//		System.out.println("Unable to find student");
//			
	m.removeStudent(u);
	}

	public static void removeTeacher() {
		System.out.println("Enter Teacher id");
		int u = scanner.nextInt();
		scanner.nextLine();
		
		m.removeTeacher(u);
	}


	public static void printStudents() {
		m.studentList();
	}

	public static void printTeachers() {
		m.teacherList();
	}
	

}
