package homework3;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1=new Student("Feyza","�akmak", "feyzaa", "D�zce �niversitesi");
		StudentManager studentManager=new StudentManager();
		studentManager.login(student1);
		studentManager.ShowInformation(student1);
		studentManager.doHomework(student1);
		
		Student student2=new Student("Nisa", "�akmak", "nisaa", "D�zce �niversitesi");
		studentManager.login(student2);
		studentManager.ShowInformation(student2);
		
		Instructor instructor=new Instructor("Engin", "Demiro�", "enginn", 1);
		InstructorManagaer instructorManagaer=new InstructorManagaer();
		instructorManagaer.login(instructor);
		instructorManagaer.ShowInformation(instructor);
		
		UserManager userManager=new UserManager();
		User[] users= {student1,student2,instructor};
		userManager.loginMultiple(users);
        userManager.ShowInfo(users);
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
	
		
	
		
		
	
		
		
	}

}
