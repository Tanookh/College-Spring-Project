package myFirstSpringProject.beans;

import org.springframework.stereotype.Component;

@Component
public class College {
	
	private String name;
	private String address;
	private int licenseNumber;
	
	
	public College()
	{
		System.out.println("Initializing college");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getLicenseNumber() {
		return licenseNumber;
	}


	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	public void display()
	{
		System.out.println(this.name + ", " + this.address + ".");
	}
}
