package hw2;

public class Student extends User {
	
	
	 int vize;
	 int finale;
	
	 
	 
	 public Student() {}
	 
	 
public Student(int id, String firstName, String lastName, String email, int password, int vize, int finale
			) {
		super(id, firstName, lastName, email, password);
		this.vize = vize;
		this.finale = finale;
		
	}
	public int getVize() {
		return vize;
	}
	public void setVize(int vize) {
		this.vize = vize;
	}
	public int getFinale() {
		return finale;
	}
	public void setFinale(int finale) {
		this.finale = finale;
	}
	public double getGrade() {
		return vize*40/100+finale*60/100;
	}

	

}
