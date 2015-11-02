/**
 * CreditCard Validator
 * @author Fredrick Kofi Tam
 * coms1004
 * Homework 6
 */

public class CreditCard {
	// instance variables
	public String creditCardNumber = "409434602754";
	public int errorCode;
	public boolean cardValidity;
	
	// constructor for CreditCard class
	public CreditCard(String creditCardNumber){
		 this.creditCardNumber = creditCardNumber;
		 errorCode = 0;
		 cardValidity = true;
		 
	}

	
	// method check
	public void check()
	{
		
		// make credit card array
		int[] cardArray = new int[creditCardNumber.length()];
		for (int i = 0; i < creditCardNumber.length(); i++)
		{
		    cardArray[i] = creditCardNumber.charAt(i) - '0';
		}
		
		// values that give condition for error code 4
		int sum = 0;

		for (int i : cardArray)
		    sum += i;
		
		
		// values that give condition for error code 5
		int sumTwo = 0;
		for (int i = 0; i<=3; i++){
			sumTwo = sumTwo + cardArray[i];
		}
		
		int sumLastFour = 0;
		for (int i = 8; i<=cardArray.length -1; i++){
			sumLastFour = sumLastFour + cardArray[i];
		}
		
		// values that give condition for error code 6
		String a = Integer.toString(cardArray[0]);
		String b = Integer.toString(cardArray[1]);
		String c = a+b;
		
		String d = Integer.toString(cardArray[6]);
		String e = Integer.toString(cardArray[7]);
		String f = d+e;
		
		int x = Integer.parseInt(c);
		int y = Integer.parseInt(f);
		 
		
		
		// Error code 1
		// (1)The first digit must be a 4.
		if (cardArray[0] != 4 ){
			errorCode = 1;	
			cardValidity = false;
			
		}
		
		// Error code 2
		// (2)The fourth digit must be one greater than the fifth digit
		else if ((cardArray[3] - 1) != cardArray[4]){
			errorCode = 2;
			cardValidity = false;
			
		}
		
		// Error code 3
		// (3)The product of the first, fifth, and ninth digits must be 24
		else if (cardArray[0]*cardArray[4]*cardArray[8] != 24){
			errorCode = 3; 
			cardValidity = false;
			
		}
		
		// Error code 4
		// (4)The sum of all digits must be evenly divisible by 4
		
		else if (sum % 4 != 0){
			errorCode = 4;
			cardValidity = false;
			
		}
		
		// Error code 5
		// (5)The sum of the first four digits must be one 
		//     less than the sum of the last four digits
		
		else if (sumTwo + 1 != sumLastFour){
			errorCode = 5;
			cardValidity = false;
			
		}
		
		
		// Error code 6
		// (6)If you treat the first two digits as a two-digit number, 
		//    and the seventh and eight digits as a two digit number, 
		//    their sum must be 100.
		
		
		else if (x + y != 100){
			errorCode = 6;
			cardValidity = false;
			
		}
		
		
	}
	
	
	public boolean isValid()
	{
		return cardValidity;
		
	
	}
	
	
	public int getErrorCode( )
	{
		return errorCode;
		
	}
	
	
	}

