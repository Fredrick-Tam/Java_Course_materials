/**
 * Student2.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */
 
 // class inherits from Person2{
 public class Student2 extends Person2{
	 
	// variables unique to class
private String major;
	
	// constructor
	public Student2(String major, String name, int yearOfBirth){
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

