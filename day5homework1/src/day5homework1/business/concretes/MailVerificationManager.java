package day5homework1.business.concretes;

import day5homework1.business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {
	
	private boolean verificationLink=false;
	boolean ifIsVerificationLinkClicked() {
		System.out.println("Kullan�c� do�rulama linkine t�klad�.");
		verificationLink=true;
		return verificationLink;
		
	}

}
