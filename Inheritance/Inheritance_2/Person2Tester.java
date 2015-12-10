/**
 * Person2Tester.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */


import java.util.*;

public class Person2Tester {
	public static final void main(String[] args) {
		
		
		// creating list people to be populated
		ArrayList<Person2> people = new ArrayList<Person2>();
	
		// add elements to list people of type Student 
		// values are hardcoded
		people.add(new Student2("Computer Engineering","Kofi Tam",1995));
		people.add(new Student2("Development Planning","Angela Tam", 1997));
		people.add(new Student2("Environmental Science","David Tam",1992));
		people.add(new Student2("Chemical Engineering","Mizpah Tam",1985));

		// Sort the list based on birth year
		Collections.sort(people);

		// parse through the list and print the elements of people 
		System.out.println("Arranging elements according to birth year "
				+ "; oldest to youngest");
		System.out.println();
		
		for(Person2 c: people) {
			System.out.println(c.getName());
		}
		
	}
	
	
}
