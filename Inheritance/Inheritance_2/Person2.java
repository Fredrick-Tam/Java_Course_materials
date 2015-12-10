/**
 * Person2.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */

 
 // implementing comparable interface
public  class Person2 implements Comparable<Person2> {
	// creating instance variables
	private String name;
	private int yearOfBirth;

	//constructors
	public Person2(String name, int yearOfBirth){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	// accessor method to obtain birth year
	public int getYearOfBirth() {
		return yearOfBirth;
	}


	// accessor method to obtain name
	public String getName() {
		return name;
	}

	
	
	
	// method that overrides default compareTo
	public int compareTo(Person2 other) {
		if(yearOfBirth < other.getYearOfBirth()){
			return -1;
		}
		else if(yearOfBirth > other.getYearOfBirth()){
			return 1;
		}
		else
			return 0;

	}



	
	


}
