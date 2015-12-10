/**
 * PersonTester.java
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 10
 */



 public class PersonTester {
	public static final void main(String[] args) {

		// create instances of each class 
		Person e = new Person("Fredrick Tam",1995);
		Student f = new Student("Computer Engineering", "Kofi Dzorkplenu", 1996);
		Instructor g = new Instructor( 300000, "Paul Blaer", 1977);
		
		// print out the toString method call to the subclasses
		System.out.println(f.toString());
		System.out.println(g.toString());
		


	}
	

}
