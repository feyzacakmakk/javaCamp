package homework3;

public class StudentManager extends UserManager{
	public void login(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" isimli ��renci giri� yapt�.");
	}
	
	
	public void doHomework(Student student) {
		System.out.println("�dev yap�ld�.");
	}
	
	
	public void ShowInformation(Student student) {
		System.out.println("Ad�: "+student.getFirstName());
		System.out.println("Soyad�: "+student.getLastName());
		System.out.println("Kullan�c� ad�: "+student.getUserName());
		System.out.println("Okul ismi: "+student.getSchoolName());
		
	}
	
	
	
	

}
