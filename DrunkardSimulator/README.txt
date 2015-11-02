Fredrick Kofi Tam
UNI: fkt2105
COMSW1104
Homework 6

****Files included****
Solutions for the questions:
Question 1. Drunkard.java : simulates the movement of a drunk person along avenues/streets in a city
Question 2. CreditCard.java : validates credit cards by comparing card numbers to make sure they meet algorithm condition.
 
***** How to compile java files *****
Step 1: open the command line
Step 2: navigate to where you have unzipped the class files
Step 3: Run 'javac' on the 2 files you wish to compile and their respective Testers.
Step 4: At this point class file would have been created and JVM can execute source code
Step 5: Run 'java' on the Tester java files.
Step 6: Follow prompts that appear based on program running.

----For CreditCard.java----
This program basically tells you if the card number you entered is valid or not. It has a lot of methods that help to
determine the validity of the card eg. step(), isValid(), check() and so on.
___Steps___
Step 1: Once compiled, run CreditCardTester.java
Step 2: You will be asked to enter a 12 digit card number to validate, Please enter you Card Number
Step 3: If card is valid, program will print out valid, else it will let you know that card is invalid
	If card number is more than 12 digits, you will be told that card number is wrong.




----For Drunkard.java---- 
This program simulates the random movement of a drunk person and takes into consideration that each move 
he makes should land him at a different intersection.

__Steps__
Step 1: Once compiled, run DrunkardTester.java
Step 2: You will be asked to enter intial street and avenue as integers, please oblige.
Step 3: The fastForward method has already been hardcoded with the value of 100 steps so dont worry about that.
Step 4: Once code is executed, program will tell you your current location and how far you are from your initial location.