/**
 * Person.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */



public class Person {
	// creating instance variables
private String name;
private  int yearOfBirth;

   // constructor with arguments name and yearOfBirth
public Person(String name, int yearOfBirth){
	this.setName(name);
	this.setYearOfBirth(yearOfBirth);
}

	// method to access yearOfBirth
public int getYearOfBirth() {
	return yearOfBirth;
}
	// method to set yearOfBirth
public void setYearOfBirth(int yearOfBirth) {
	this.yearOfBirth = yearOfBirth;
}
	// method to access name
public String getName() {
	return name;
}
	// method to set name
public void setName(String name) {
	this.name = name;
}


	
	
	
	
	
}
