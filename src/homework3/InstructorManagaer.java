package homework3;

public class InstructorManagaer extends UserManager{
    public void login(Instructor instructor) {
    	System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" isimli e�itmen giri� yapt�.");
    	
	}
	
	
	public void giveHomework(Instructor instructor) {
		System.out.println("yeni �dev verildi.");
	}
	
	public void ShowInformation(Instructor instructor) {
		System.out.println("Ad�: "+instructor.getFirstName());
		System.out.println("Soyad�: "+instructor.getLastName());
		System.out.println("Kullan�c� ad�: "+instructor.getUserName());
		System.out.println("Id: "+instructor.getInstructorId());
		
	}

}
