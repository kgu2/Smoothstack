import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author kgu82
 *
 */
public class GuessingGame {
	
	public final static int BOUND = 10;
	public final static int NUMBER_CHANCES = 4;
	
	public static void main(String[] args) {	
		
		// generates random number from 1-100 inclusive
		Random r = new Random();
		int rand = r.nextInt(101) + 1;
		
		// prompts input from user
	    Scanner scan = new Scanner(System.in);  
	    System.out.println("Guess a number between 1-100");
	    
	    // error checking for integer
	    int number = getInput(scan);
	      
	    int count = 0;
	    while(count < NUMBER_CHANCES) {
	    	
	    	// if number is within bound of 10 from user guess, game is over
		    if((int)Math.abs(number - rand) <= BOUND) {
		    	System.out.println("You win, Answer: " + rand);
		    	break;
		    }
		    else {
		    	System.out.println("Try again: ");
		    	number = getInput(scan);
		    }
		    count++;
	    }
	  
	    if(count == NUMBER_CHANCES) {
		    System.out.println("Sorry: " + rand);
	    }
	    
	    scan.close();
	}
	
	/**
	 * This method reads in input, validates that it is an integer, and returns the number.
	 * If it is not an integer it will keep prompting the user for input.
	 */
	public static int getInput(Scanner scan) {
	    while(!scan.hasNextInt()) {
	    	System.out.println("Invalid input, Enter number between 1-100");
	    	scan.next();
	    }
	    int number = scan.nextInt();  
	    return number;
	}
}
