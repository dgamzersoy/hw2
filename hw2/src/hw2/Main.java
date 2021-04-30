package hw2;

public class Main {


	public static void main(String[] args) {
		
	   Student student1 = new Student();
	   student1.id=1;
	   student1.firstName ="Alparslan";
	   student1.lastName = "Özdemir";
	   student1.email="alparslanozdemir.com";
	   student1.password=788906;
	   student1.vize = 70;
	   student1.finale =90;
	   
	   StudentManager studentManager = new StudentManager();
	   studentManager.add(student1);
	   
	  System.out.println( "öğrencinin ortalaması:" +student1.getGrade());
	  
	  Instructor instructor1 = new Instructor();
	  instructor1.firstName="Gamze";
	  instructor1.lastName ="Ersoy";
	  instructor1.salary =12000;
	  
	  InstructorManager instructorManager = new InstructorManager();
	  instructorManager.add(instructor1);
	  
	  System.out.println("eğitmen maaşı: " + instructor1.getSalary());
	  
	  User user1 = new User ();
	  user1.email ="samet.samet";
	  user1.password=123456;
	  
	  UserManager userManager = new UserManager();
	  userManager.show(user1);
	  System.out.println("email adresi: " + user1.password);
	  
	  
	   
	   
        
	}


}
