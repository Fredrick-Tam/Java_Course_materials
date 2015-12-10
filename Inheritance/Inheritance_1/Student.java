/**
 * Student.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */


// inherit properties from Person using extend 
public class Student extends Person{
	
	// instance variables specific to Student instantiated
	private String major;
	
	// constructor with arguments
	public Student(String major, String name, int yearOfBirth){
		// using keyword super to gain access to super class' variables
		super(name,yearOfBirth);
		this.major = major;
	}
	
		// toString method that overrides default one
	public String toString() {
		String x = super.getName() + " , " + major + ",  " + super.getYearOfBirth();
		return x;
		}

}
