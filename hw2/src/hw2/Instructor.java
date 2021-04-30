package hw2;



public class Instructor extends User{
	
	int salary;
	

	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, int password, int salary) {
		super(id, firstName, lastName, email, password);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
