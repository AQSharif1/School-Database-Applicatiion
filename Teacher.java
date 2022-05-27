

public class Teacher extends Person{
	private int id;
	private double salary;
	private String teaches;
	
	public Teacher(String name, int age, int id, String teaches) {
		super(name, age);
		this.id = id;
		this.teaches = teaches;
		
	}	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTeaches() {
		return teaches;
	}

	public void setTeaches(String teaches) {
		this.teaches = teaches;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		String str = " ";
		str= "Name: " + name + ", Age: " + age + ", Teacher ID: " + id + ", Teaches: " + teaches + ", Salary: " + salary;
		return str;
	}
	
}
