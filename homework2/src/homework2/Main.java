package homework2;

public class Main {

	public static void main(String[] args) {
		System.out.println("*KURSLAR*");
		Courses course1=new Courses("JAVA & REACT KAMPI","Engin DEM�RO�");
		System.out.println("kurs ad�: "+course1.courseName);
		System.out.println("kurs e�itmeni: "+course1.teacher);
				
		Courses course2=new Courses("C# KAMPI","Engin DEM�RO�");
		System.out.println("kurs ad�: "+course2.courseName);
		System.out.println("kurs e�itmeni: "+course2.teacher);
				
		Courses[] courses= {course1,course2};
		for (Courses coursess : courses) {
			System.out.println(coursess.courseName);
		}
			
		CourseManager course=new CourseManager();
		course.add(course1);
				
		System.out.println("*S�k sorulan sorular*");
		Questions question1=new Questions(1, "kamp hangi g�nler olacak?","�ar�amba ve cumartesi");
		Questions question2=new Questions(2, "kamp ne kadar s�recek?","2 ay");
		
		Questions[] questions= {question1,question2};
		for (Questions questions2 : questions) {
			System.out.println(questions2.number+": "+questions2.question);
			System.out.println(questions2.number+" sorunun cevab�: "+questions2.answer);
		}
		
		

	}

}
