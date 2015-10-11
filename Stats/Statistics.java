/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Homework 4
 * Problem2: Calculate statistics
 * Statistics.java : Determines the mean, median, mode etc
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
	
	
	// method to calculate max
	public static void max(double[] a)
	{
	
		double max =  a[0];
		for (int i = 1; i < a.length; i++) {
		    if (a[i] > max) {
		      max =  a[i];
		     
		    }
		    
		}
		System.out.println("The max is" + " " +max);
			}



	// method to calculate min
	public static void min(double[] a)
	{

		double min = a[0];
		for (int i = 1; i < a.length; i++) {
		    if (a[i] < min) {
		      min =  a[i];
		    }
		}
		System.out.println("The min is" + " " + min);
	}
	
	// method to calculate median
	public static void median(double[] a )
	{
		Arrays.sort(a);
		
		   int middleNum = a.length/2;
		    if (a.length%2 == 1) {
		    	System.out.println("The median is" + " " + a[middleNum]);
		    } else {
		    	System.out.println("The median is" + " " + (a[middleNum-1] + a[middleNum]) / 2.0);
		    }
		
	}
		
		
	
	// method to calculate mean
	public static double mean(double[] a )
	{
		double sum = 0;
	    for (int i = 0; i < a.length; i++) {
	        sum += a[i];
	    }
	    double mean =  sum / a.length;
	    System.out.println("The mean is" + " " + mean);
		return mean;
		
		
	}
	
	//method to calculate mode 
	public static void mode(double[] a )
	{
		  int maxValue = 1, maxCount = 1;

		    for (int i = 0; i < a.length; ++i) {
		        int count = 0;
		        for (int k = 0; k < a.length; k++) {
		            if (a[k] == a[i]) count++;
		        }
		        if (count > maxCount) {
		            maxCount = count;
		            maxValue = (int) a[i];
		        }
		    }

		    System.out.println("The mode is" + " " + maxValue);
		}
		
		
	
	
	// method to calculate standard deviation 
	public static void stdDev(double[] a )
	{
		 double mean = Statistics.mean(a);
		double stdSum = 0;
		 
		for (int i = 0; i < a.length; i++) {
			stdSum += Math.pow(a[i] - mean, 2);
			}
		System.out.print("The standard deviation is " );
		System.out.println(Math.sqrt((stdSum) / (a.length - 1)));
		
	}
}
	
