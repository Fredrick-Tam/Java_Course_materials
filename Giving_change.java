import java.util.Scanner;
/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Question 2
 * Giving_change.java, prints out the change due customer in terms of number of coins/bills due
 *
 */
public class Giving_change{
	public static void main(String args[]){

	// get the amount due from customer in pennies
	Scanner amountDue= new Scanner(System.in);
	System.out.print("Enter amount customer must pay in pennies:");
	int amountToPay = amountDue.nextInt();
	
	// get the amount paid by customer
	Scanner amountRec= new Scanner(System.in);
	System.out.print("Enter amount received from customer:");	
	int amountPaid = amountRec.nextInt();	
	
	// get the initial change
	int change = amountPaid - amountToPay;
	
	System.out.println("Your change is:" + change + "");
	
	//get change in dollars
	int dollars = (int)change / 100;
	int change1 = change - (100*dollars);
	// print out number of dollars you get back as change
	System.out.println("The number of dollars you get back is:" + dollars + "");	
	
	// get change in quarters
	int quarters = (change1)/25 ;
	int change2  = change1-(25*quarters);
	// print out number of quarters you get back as change
	System.out.println("The number of quarters you get back is:" + quarters + "");
	
	// get change in quarters
	int dimes = (change2)/10 ;
	int change3 = change2-(10*dimes);
	// print out number of quarters you get back as change
	System.out.println("The number of dimes you get back is:" + dimes + "");
	
	//get change in nickels
	int nickels = (change3)/5;
	int change4 = (change3)-(5*nickels);
	// print out number of nickels you get back as change
	System.out.println("The number of nickels you get back is:" + nickels + "");
	
	int pennies = (change4); 
	// print out number of pennies you get back as change
	System.out.println("YThe number of pennies you get back is:" + pennies + "");
	
	}
}
	