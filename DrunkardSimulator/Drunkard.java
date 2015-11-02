/**
 * Drunkard.java, simulates the movement of a Drunkard along avenues/streets
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 6
 */

import java.util.Random;


public class Drunkard {
	// declare instance variables
	public int avenue;
	public int street;
	final int streetOriginal; 
	final int avenueOriginal;
	
	// Drunkard constructor
	public Drunkard(int avenue, int street){
		this.avenue = avenue;
		this.street = street;
		  streetOriginal = street;
		  avenueOriginal = avenue;
		}
	
	
	// the method step, which indicates random decision taken by drunkard
	public void step(){
		// random selector to specify whether drunkard 
		// moves along street or avenue
		 int drunkMovement = 0 + (int)(Math.random() * ((1 - 0) + 1));
		 
		 // Drunkard can move either up or down avenue/street
		 int[] movement = {-1,1};
		 int rnd = new Random().nextInt(movement.length);
		 
		 // conditionals that specify How drunkard moves
		 if (drunkMovement == 0){
		 avenue = rnd + avenue;
		 System.out.println("You moved to" + "street: "+ street + "avenue: " +
		 avenue+ "" );
		 }
		 
		 else if (drunkMovement == 1){
		 street =  rnd + street;
		 System.out.println("You moved to" + "street: "+ street + "avenue: " +
				 avenue+ "" );
		 }
	}
	
	
	// fastForwardmethod
	public void fastForward(int steps){
		int x = 0;
		// loop that continues until steps have been exhausted
			while(x <= steps){
			int drunkMovement = 0 + (int)(Math.random() * ((1 - 0) + 1));
			
			if (drunkMovement == 0){
				int[] movement = {-1,1};
				int rnd = new Random().nextInt(movement.length);	
			 avenue = avenue + rnd;
			 
			 
			 }
			 
			else if (drunkMovement == 1){
				int[] movement = {-1,1};
				int rnd = new Random().nextInt(movement.length);
				street = street + rnd;
			}
			 
			 
			 x++;
			 }
			
		
	}
	
	// get location method
	public String getLocation(){
		int currentAvenue = avenue;
		int currentStreet = street;
		return " Street No. " +currentStreet +
				", Avenue " + currentAvenue +""  ;
		

	}
	
	// howFar method that tells you your distance from initial position
	public int howFar(){
		int distance = Math.abs(avenue - avenueOriginal) + Math.abs(street - streetOriginal);
		return distance;
	}
	
	
	}

