package myFirstSpringProject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	private String firstName, lastName;
	private int age;
	
	@Autowired
	private College myCollege;
	
	public Student()
	{
		System.out.println("Creating student with default constructor");
	}
	
	public Student(String firstName, String lastName, int age)
	{
		System.out.println("Creating a new student: " + firstName + " " + lastName + ", age: " + age);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;			
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected College getMyCollege() {
		return myCollege;
	}

	protected void setMyCollege(College myCollege) {
		this.myCollege = myCollege;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display()
	{
		System.out.print("\nMy name is " + this.firstName + " " + lastName);
		System.out.print(", I am " + this.age + " years old");
		System.out.print(", I study in ");
		this.myCollege.display();
	}
}
