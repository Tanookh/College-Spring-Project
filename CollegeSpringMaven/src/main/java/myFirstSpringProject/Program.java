package myFirstSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import myFirstSpringProject.beans.Student;
import myFirstSpringProject.beans.College;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurations.class);
		
		College college = context.getBean(College.class);
		college.setName("Ort Braude");
		college.setAddress("Karmiel");
		college.setLicenseNumber(123);
		
		Student student1 = context.getBean(Student.class, "Tanookh", "Kabishi", 26);
		Student student2 = context.getBean(Student.class, "Ameer", "Aomer", 29);

		if(student1 == student2)
		{
			System.out.println("Students are equals");
		}
		else
		{
			System.out.println("Students are different");
		}
		
		student1.display();
		student2.display();
	}
}
