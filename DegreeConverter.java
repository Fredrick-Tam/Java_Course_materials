import java.util.Scanner;
/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Question 3
 * DegreeConverter.java, converts from fahrenheit to celsius and vice versa
 */
public class DegreeConverter {
	public static void main(String args[]){
	// welcoming message
	System.out.println("Welcome to the Temperature converter!");
	
	// menu options 
	System.out.println("To convert from fahrenheit to celsius, please enter: 1");	
	System.out.println("To convert from celsius to fahrenheit, please enter: 2");
	
	//Gets chosen option from user
	Scanner input = new Scanner(System.in);
	int option = input.nextInt();
	
	// code to execute if user chooses option 1
	if(option == 1)
	{	
		//prompts user to enter temperature in fahrenheit 
		System.out.println("Great! you have chosen to convert from fahrenheit to celsius");
		System.out.print("Enter the temperature in fahrenheit:");
		
		//assign input from user to variable
		Scanner valA = new Scanner(System.in);
		double fahr = valA.nextDouble();
		
		// formula that converts to celsius is implemented
		double celsius = (fahr - 32) * 5/9;
		
		//print out the result
		System.out.printf("%.2f",celsius);
		System.out.print(" is the equivalent temperature in celsius");
	}
	
	// code to execute if user chooses option 2	
	else if(option == 2)
	{
		//prompts user to enter temperature in celsius
		System.out.println("Great! you have chosen to convert from celsius to fahrenheit");
		System.out.print("Enter the temperature in celsius:");	
		
		//takes in value from user and assigns it to variable
		Scanner valB = new Scanner(System.in);
		double cels = valB.nextDouble();
		
		// formula that does the conversion is implemented
		double fahrenheit = (cels * 9/5) + 32;
		
		//print out the result
		System.out.printf("%.2f" ,fahrenheit);
		System.out.print(" is the equivalent temparature in fahrenheit");
		
	}
		
		
	}
}
	
	