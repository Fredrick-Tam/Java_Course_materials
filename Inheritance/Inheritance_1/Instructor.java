/**
 * Instructor.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */
 
 
 // Instructor inherits from Person using extends keyword
 
 public class Instructor extends Person {
	 // instance variable specific to class, salary
	private int salary;
	
	// constructor with arguments 
	public Instructor(int salary, String name, int yearOfBirth){
		// using keyword super to gain access to super class' variables
		super(name,yearOfBirth);
		this.salary = salary;
	}
	
	// toString method that overrides default one
	public String toString() {
		String x = super.getName() + " , " + salary + ", " + super.getYearOfBirth();
		return x;
		}
	
	
}