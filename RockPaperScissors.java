/**
 * Fredrick Kofi Tam
 * UNI: fkt2105
 * Homework 4
 * Problem3: RockPaperScissors
 * RockPaperScissors.java : engages player and computer in game,
		and determines the champion after ten rounds
 *
 */
 


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// Introduction to games
		System.out.println("Welcome to the rock, paper, scissors game!!");
		System.out.println("Can you beat the computer in a ten round bout?");
		System.out.println("Enter your choice as follows:");
		// Instructions for how to input choice
		System.out.println("0 for rock, 1 for paper, or 2 for scissors");
		
		
		Scanner in = new Scanner(System.in);
		// Initializing scoreboard for the game
		int compWins = 0;
		int userWins = 0;
		
		// loop through the game till either user or computer wins 1o times
		while(compWins <= 10 || userWins <= 10){
		System.out.println();
		// prints out the current score
		System.out.println("User Score:" + userWins);
		System.out.println("Computer Score:" + compWins);
		
		int userChoice = in.nextInt();
		
		// getting computer choice using Random class
		Random r = new Random();
		int compChoice = r.nextInt(3);
		
		//print out the computer's choice
		System.out.println(compChoice);
		
		
		// conditions that decide who has won a round
		if(userChoice == 0 && compChoice == 1)
		{
			System.out.println("computer wins!");
			compWins+=1;
			
		}
		
		else if(userChoice == 1 && compChoice == 0)
		{
			System.out.println("You win!");
			userWins+=1;
			
		}
		
		else if(userChoice ==0  && compChoice ==2 )
		{
			System.out.println("You win!");
			userWins+=1;
			
		}
		
		
		
		else if(userChoice == 2 && compChoice == 0)
		{
			System.out.println("computer wins!");
			compWins+=1;
			
		}
		
		else if(userChoice == 2 && compChoice == 1)
		{
			System.out.println("You win!");
			userWins+=1;
			
		}
		
		else if(userChoice == 1 && compChoice == 2)
		{
			System.out.println("computer wins!");
			compWins+=1;
			
		}
		
		else if(userChoice == compChoice )
		{
			System.out.println("Tie, play again");
			
			
		}
		
		// prints out the winners of the ten round game
		if(compWins== 10){
			System.out.println("Computer is the champion!!!");
			break;
			}
		
		if(userWins == 10){
			System.out.println("You are the champion!!!");
			break;
			}
		
		
		}
		
		
		
	}

}
