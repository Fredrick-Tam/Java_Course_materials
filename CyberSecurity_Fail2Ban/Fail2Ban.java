import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Fail2Ban.java, goes through log files and print out IP addresses of
 * invalid log-ins that occur more than 3 times
 * @author Fredrick Kofi Tam
 * coms1004
 * UNI: fkt2105
 * Homework 8
 */


public class Fail2Ban {

	public static void main(String[] args) throws FileNotFoundException  {
		
		// Prompt for the input and output file names
		if (args.length != 1)
		{
			System.out.println("Just enter one argument; the file/logs to process");
		}
		
		else{
		// filename is taken as a command line argument and processing begins
		 String fileName = args[0];
		 
		 
		
		 // Construct the Scanner and PrintWriter objects for reading and writing
		 File inputFile = new File(fileName);
		 Scanner  inFile= new Scanner(inputFile);
		 
		 //creates output file called ban.txt
		 PrintWriter out = new PrintWriter("ban.txt");
		 
		 // initializes lists that will be used to process the file
		 List<String> invalidCount = new ArrayList<>();
		 List<String> invalidIps = new ArrayList<>();
		 
		 // looping through input to split lines
		 while (inFile.hasNextLine())
		 {
			 String line = inFile.nextLine();
			 
			 // splits the lines into a list with values seperated by spaces
			 String[] lines = line.split(" ");
		 
			 // checks for lines that have 5th element with string invalid
			 if (lines[5].equals("Invalid"))
			 {
			 // appends IP addresses to list invalidIps
			 invalidIps.add(lines[9]);
			 }
			 
		 
		 }
		 
		//  looping through to find how many times elements occur
		for( String address: invalidIps)
		{
			// count number of times IP address occurs
			int count = Collections.frequency(invalidIps, address);
			
			// if IP address occurs more than thrice, append to invalidCount
			if(count >= 3)
			{
				invalidCount.add(address);
			}
		}
		
		// make a set to keep unique IP address values
		Set<String> Ips = new HashSet<String>(invalidCount);
		
		for(String val : Ips)
		{	
			// print IP addresses to out to file
			 out.println(val);
		}
		
		// close the input file
		 inFile.close();
		// close output file
		 out.close();
	 }
	}
		
}
		

	


