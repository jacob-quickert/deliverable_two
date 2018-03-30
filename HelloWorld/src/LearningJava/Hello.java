package LearningJava;

import java.util.Scanner;

public class Hello {
	
public static void main(String [] args) {
	Scanner scnr = new Scanner (System.in);
	String strFirstNum;
	int firstNum;
	String strSecondNum;
	int secondNum;
	int firstNumLength;
	int secondNumLength;
	int modulusMod1;
	int modulusMod2;
	int i;
	int compareDigit1;
	int compareDigit2;
	int compareDigitTotal1;
	int compareDigitTotal2;
	boolean isNumeric1;
	boolean isNumeric2;
	boolean isEqualLength;
	boolean isEqualDigit;
	
	// obtain user input for first number
	System.out.println("Please enter a number: ");
	strFirstNum = scnr.next();
	
	// initialize boolean and check that input is a number
	// don't let them continue until they input a number
	isNumeric1 = strFirstNum.chars().allMatch( Character::isDigit );
	while (isNumeric1 == false) {
		System.out.println("That is not a number. Please enter a number: ");
		strFirstNum = scnr.next();
		//recheck that it's a number by updating the value of isNumeric1
		isNumeric1 = strFirstNum.chars().allMatch( Character::isDigit );
		if (isNumeric1 == true) {
			break;
		}
		else {
			
		}
	}
		// print out the first number for clarity
		System.out.println("Your first number is: " + strFirstNum);
	
	// obtain user input for second number
	System.out.println("Please enter another number of the same length: ");
	strSecondNum = scnr.next();
	
	// initialize boolean and check that input is a number
	// don't let them continue until they input a number
	isNumeric2 = strSecondNum.chars().allMatch( Character::isDigit );
	while (isNumeric2 == false) {
		System.out.println("That is not a number. Please enter a number of the same length as your first number: ");
		//get new input
		strSecondNum = scnr.next();
		// update value of isNumeric2
		isNumeric2 = strSecondNum.chars().allMatch( Character::isDigit );
		if (isNumeric2 == true) {
			// break the cycle once they give a proper value
			break;
		}
		else {
			// keep looping until we get a proper value 
		}
	}
	// initialize the input lengths
	firstNumLength = strFirstNum.length();
	secondNumLength = strSecondNum.length();
	isEqualLength = secondNumLength == firstNumLength;
	
	// compare the second input to the first. 
	// must be the same length before proceeding 
	while (isEqualLength == false) {
		if (isEqualLength == true) {
			break;
		}
		else {
			System.out.println("Sad! Your numbers do not match in length.");
			System.out.println("Try again. ");
			// get new input
			strSecondNum = scnr.next();
			// update value for comparison
			secondNumLength = strSecondNum.length();
			// update comparison for truth check
			isEqualLength = secondNumLength == firstNumLength;
			// make sure they don't retry to put in letters
			isNumeric2 = strSecondNum.chars().allMatch( Character::isDigit );
			while (isNumeric2 == false) {
				System.out.println("That is not a number. Please enter a number of the same length as your first number: ");
				strSecondNum = scnr.next();
				isNumeric2 = strSecondNum.chars().allMatch( Character::isDigit );
				if (isNumeric2 == true) {
					break;
				}
				else {
				
				}
			
			}
		}
	}
	
	
	// print out the second number for clarity
	System.out.println("Your second number is: " + strSecondNum);
	System.out.println("Comparing...");
	System.out.println("");
	
	// convert the strings to integers for the math
	firstNum = Integer.valueOf(strFirstNum);
	secondNum = Integer.valueOf(strSecondNum);
	
	//System.out.println(firstNum + secondNum);
	
	// the math
	// first set up a couple mod values to loop with
    modulusMod1 = 10;
    modulusMod2 = 1;


    compareDigit1 = (firstNum % modulusMod1) / modulusMod2;
    compareDigit2 = (secondNum % modulusMod1) / modulusMod2;
    
    // first iteration outside of "for" loop to obtain compareDigitTotal1
    compareDigitTotal1 = compareDigit1 + compareDigit2;
    
    // obtain fresh compareDigitTotal2 at each iteration
    for (i = 0; i < strFirstNum.length(); i++) {

        compareDigit1 = (firstNum % modulusMod1) / modulusMod2;
        compareDigit2 = (secondNum % modulusMod1) / modulusMod2;
        compareDigitTotal2 = compareDigit1 + compareDigit2;
        


        modulusMod1 *= 10;
        modulusMod2 *= 10;
        
        // initialize isEqualDigit variable
        isEqualDigit = compareDigitTotal2 == compareDigitTotal1;
        
        // at first false value, program prints "false" and exits
        if (isEqualDigit == false) {
        		System.out.println("false");
        		System.exit(0);
        }
        else {
        	
        }

    }

	
	scnr.close();
	
	// if all "for" loop values for isEqualDigit are true, program prints "true"
	System.out.println("true");
}
	
	
}