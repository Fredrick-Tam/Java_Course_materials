/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Homework 4
 * Problem2: Calculate statistics
 * StatisticsTester.java : Determines the mean, median, mode etc
 *
 */


import java.util.Scanner;
public class StatisticsTester {

	public static void  main(String[] args) {
		// welcomes you to main
		System.out.println("Welcome to the statistics center!");
		
		System.out.println();
		// asks for length of input array
		System.out.println("How many elements should list have:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
	
			// initializing a new array, 'a'
			double[] a = new double[num];
			int m = 1;

			// filling the array with elements
			System.out.println("Enter list elements.");
			for(int i=0;i<num;i++) {
				System.out.println("Enter number " + m++  );
				a[i] = in.nextDouble();
			}
			
			// prints out array
			System.out.print(" a = ");
			for(int j=0; j<num;j++){
				System.out.print(" "+ a[j] + " ");
			}
		
			System.out.println();
			System.out.println();
			
			// Choose to operate on array based on the modes listed
		System.out.println("Choose from the following modes to find info"
				+ " about your data inputed");
		
		
		
		System.out.println("1. Max");
		System.out.println("2. Min");
		System.out.println("3. Median");
		System.out.println("4. Mode");
		System.out.println("5. Mean");
		System.out.println("6. Standard deviation");
		
		
		
		System.out.println();	
		// ask user to decide what option to execute
		System.out.print("What mode do you want?");
		
		// take in user's choice as input
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		// conditions and methods to execute based on user input
		if(choice ==1){
			Statistics.max(a);
		}
		
		else if(choice ==2){
			Statistics.min(a);
		}
		else if(choice ==3){
			Statistics.median(a);
		}
		
		else if(choice ==4){
			Statistics.mode(a);
		}
		
		else if(choice ==5){
			Statistics.mean(a);
		}
		
		else if(choice ==6){
			Statistics.stdDev(a);
		}
		
		
		
			}

	}	

		
		



