package homework3;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+" giri� yapt�.");
	}
	
	public void loginMultiple(User[] users) {
		for (User user : users) {
			login(user);
		}
		
	}
	
	public void ShowInformation(User user) {
		System.out.println("Ad�: "+user.getFirstName());
		System.out.println("Soyad�: "+user.getLastName());
		System.out.println("Kullan�c� ad�: "+user.getUserName());
		
	}
	
	public void ShowInfo(User[] users) {
		for (User user : users) {
			ShowInformation(user);
		}
	}
	

}
