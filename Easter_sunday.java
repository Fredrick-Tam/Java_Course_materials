import java.util.Scanner;
/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Question 1
 * Easter_Sunday.java: prints out the month and day of easter Sunday based on year you provide
 *
 */
public class Easter_sunday{
	public static void main(String[] args){
		// ask user for input; the desired year
		System.out.print("Enter the year:");
		Scanner val = new Scanner(System.in);
		
		// assign the inputed value to variable y
		int year = val.nextInt();
		
		// declare all variables to be used for easy use
		int aa,bb,cc,dd,ee,gg,hh,jj,kk,mm,rr, month, day;
		
		// computations to get Easter Sunday
		aa = year % 19;
		bb = year / 100;
		cc = year % 100;
		dd = bb / 4;
		ee = bb % 4;
		gg = (8*bb +13 )/25 ;
		hh = (19*aa + bb -dd - gg + 15)% 30;
		jj = cc / 4;
		kk = cc % 4;
		mm = (aa + 11*hh)/ 319;
		rr = (2*ee + 2*jj -kk -hh + mm +32) % 7;
		month = (hh - mm + rr + 90)/25;
		day = (hh - mm + rr + month + 19) % 32;
		
		// print the month and day of easter Sunday
		System.out.println("Easter Sunday is on" +" " + month + '/' + day + '/' + year);
		
				
		
		
		
		
		
		
		
	}
	
	
	
	
	
}