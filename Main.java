
public class Main {
	public static void main(String[]args) {
		
		Student sList = new Student();
		
		sList.addStudent("Mike" , 10);
		sList.addStudent("Mike", 10);
		sList.addStudent("Dave", 20);
		sList.studentList();
		
		sList.removeStudent("Mike", 10);
		
		sList.studentList();
		
	}

}
