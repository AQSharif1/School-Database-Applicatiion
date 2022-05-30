import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
	
	Scanner scanner = new Scanner(System.in);
	private String schoolName;
	private List<Student> students;
	private List<Teacher> teachers;
	
	public School(String name) {
		this.schoolName = name;
		this.students = new ArrayList<Student>();
		this.teachers = new ArrayList<Teacher>();
	}
	
	/**
	 * Adds student
	 * @param s
	 * @return boolean
	 */
	public boolean addStudent(Student s) {
		for(int i = 0; i< students.size(); i++) {
			if(students.get(i).getId() == s.getId()) {
			//	System.out.println("Student already in List.\n");
				return false;
			}
		}
		students.add(s);
		//System.out.println(s.getName() + " added");
		return true;
	}
	/**
	 * Adds student
	 * @param name
	 * @param age
	 * @param id
	 * @return boolean
	 */
	
	public boolean addStudent(String name, int age, int id) {
		for(int i = 0; i< students.size(); i++) {
			if(students.get(i).getId() == id) {
				System.out.println("Student already in List.\n");
				return false;
			}
		}
		Student newS = new Student(name, age, id);
		students.add(newS);
		System.out.println(name + " added");
		return true;
	}
	
	/**
	 * Method adds Teacher into list
	 *@param: name, age, id
	 *
	 * @return boolean
	 */
	public boolean addTeacher(String name, int age, int id, String teaches) {
		for(int i = 0; i< teachers.size(); i++) {
			if(teachers.get(i).getId() == id) {
			//	System.out.println("Teacher already in List.\n");
				return false;
			}
		}
		Teacher newT = new Teacher(name, age, id,teaches);
		teachers.add(newT);
		//System.out.println(name + " added");
		return true;
	}
	
	/**
	 * Adds teachere
	 * @param t
	 * @return boolean
	 */
	public boolean addTeacher(Teacher t) {
		for(int i = 0; i< teachers.size(); i++) {
			if(teachers.get(i).getId() == t.getId()) {
				System.out.println("Teacher already in List.\n");
				return false;
			}
		}
		teachers.add(t);
		System.out.println(t.getName() + " added");
		return true;
	}
	
	/**
	 * Removes Student
	 * @param s
	 * @return
	 */
	public boolean removeStudent(Student s) {
		for(int i = 0; i< students.size(); i++) {
			if(students.get(i).getId() == s.getId()) {
				students.remove(i);
				System.out.println(s.getName() + ", Removed\n");
				return true;
			}
		}
		System.out.println(s.getName() + ", Not in List\n");
		return true;
	}
	
	/**
	 * REmoves teacher
	 * @param t
	 * @return
	 */
	public boolean removeTeacher(Teacher t) {
		for(int i = 0; i< teachers.size(); i++) {
			if(teachers.get(i).getId() == t.getId()) {
				teachers.remove(i);
				System.out.println(t.getName() + ", Removed\n");
				return true;
			}
		}
		System.out.println(t.getName() + ", Not in List\n");
		return true;
	}
	
	
	public boolean removeStudent(int sID) {
		for(int i = 0; i<students.size(); i++) {
			if(students.get(i).getId() == sID) {
				System.out.println("Removed Student: " + students.get(i).getName() );
				students.remove(i);
				return true;
			}
		}
		System.out.println("Unable to find Student");
		return false;
	}
	
	/**
	 * deletes teacher using student id
	 * @param i
	 * @return
	 */
	public boolean removeTeacher(int sID) {
		for(int i = 0; i<teachers.size(); i++) {
			if(teachers.get(i).getId() == sID) {
				System.out.println("Removed Teacher: " + teachers.get(i).getName() );
				teachers.remove(i);
				return true;
			}
		}
		System.out.println("Unable to find Teacher");
		return false;
	}
	
	
	
	/**
	 * Prints list of Students
	 */
	public void studentList() {
		System.out.println("************************************************** \nStudents:");
		for(int i = 0; i< students.size(); i++) {
			
			System.out.println(students.get(i).toString());
		}
		System.out.println("**************************************************");
	}
	
	/**
	 * Prints list of Teachers
	 */
	public void teacherList() {
		System.out.println("************************************************** \nTeachers:");
		for(Person i: teachers) {
			
			System.out.println(i.toString());
		}
		System.out.println("**************************************************");
	}
	
/**
 * gets Studenet List
 * @return
 */

	public List<Student> getStudents() {
		return students;
	}

	
	/**
	 * gets Teacher List
	 * @return
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	
}

