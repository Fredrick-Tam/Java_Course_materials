Fredrick Kofi Tam
UNI: fkt2105
COMSW1104
Homework 8

****Files included****
Fail2Ban.java
README.txt


***** How to compile java file *****
Step 1: open the command line
Step 2: navigate to where you have unzipped the file/folder
Step 3: Run 'javac' on the .java file that you want to compile.
Step 4: At this point class file would have been created and JVM can execute source code
Step 5: Run 'java' on the the java program with a command line argument that represents the file you want to process.
Step 6: Follow prompts that appear based on program running.

----For Fail2Ban.java----
This program basically tells you the IP addresses of computer users who unsuccessfully tried to log in 
to an account (based on log files you give it) on more than 3 occassions.
The code extracts the IP address from the lines and determines whether the line is a failed login attempt or valid login attempt.
The IP addresses of computers that failed to log in more than thrice are kept track of and printed out to a new file that can easily be read.
This code, though relatively simple, could and probabvly has huge implications and applications in the cybersecurity industry.

___Steps to run Fail2Ban___
Step 1: Once compiled, run Fail2Ban.java in the command line/terminal by typing,
java Fail2Ban, followed by input file to be processed as an argument for example.
Java Fail2Ban logs_processed.txt.

Step 2: Once you are done and hit enter, the program will scan through the contents of the file, manipulate it, and print the
resulting invalid IP addresses that occur more than thrice to file ban.txt

Step 3: The file ban.txt will be created in the same folder as the java program file and the results of the file
processing can be checked to find out who has been trying to sign into an account more than thrice.
