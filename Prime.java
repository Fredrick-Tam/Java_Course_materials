/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Homework 4
 * Problem1: Write a prime number checker
 * Prime.java : Determines whether a number taken as input is a prime number
 *
 */

public class Prime {

	public static void main(String[] args) 
	{
		
		// hard coded values
		System.out.println(isPrime(2));
		System.out.println(isPrime(14));
		System.out.println(isPrime(17));
		System.out.println(isPrime(28));
		System.out.println(isPrime(11));
		System.out.println(isPrime(55));
		System.out.println(isPrime(33));
		
	}
	// method that determines whether number is a prime
	public static boolean isPrime(int number) {
		// assigning a variable to designate the square of the desired number
		
        int sqrt = (int) Math.sqrt(number) + 1;
		
        for (int i = 2; i < sqrt; i++)
		{
            if (number % i == 0) 
            {
            	
                // number is perfectly divisible - no prime
                return false;
            }
        }
        // number is not perfectly divisible - is prime
        return true;
    }
	
}