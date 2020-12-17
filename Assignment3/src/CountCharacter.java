import java.io.File;
import java.util.Scanner;

/**
 * Counts number of times a character appears in a file, character is specified via command line argument
 * 
 * @author kgu82
 *
 */
public class CountCharacter {
	public static void main(String[] args) {
		
		// checks if argument is valid character 
		if(checkValidChar(args[0])) {
			
			char element = args[0].charAt(0);
			element = Character.toUpperCase(element);
			
			try {
				// prompts user for file name input
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter file name: ");
				
				String fileName = scan.nextLine();
				File file = new File(fileName);
				
				while(!file.isFile()) {
					System.out.println("File does not exist, try again");
					fileName = scan.nextLine();
					file = new File(fileName);
				}
				
				scan.close();
				
				// reads file to find total number of characters
				scan = new Scanner(file);
				int totalCharacters = 0;
				
				while(scan.hasNext()) {
					String s = scan.next();
					char[] ary = s.toUpperCase().toCharArray();
					for(char c: ary) {
						if(c == element) {
							totalCharacters++;
						}
					}
				}
				
				System.out.println(totalCharacters);
				scan.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}		
		else {
			System.out.println("Invalid Character Argument");
		}
		
	}
	
	/**
	 * This method checks if a given String is a valid character A-Z or 0-9
	 * @param str
	 */
	public static boolean checkValidChar(String str) {
		if(str.length() != 1) {
			return false;
		}
		
		char element = str.charAt(0);
		if(!Character.toString(element).matches("^[a-zA-Z0-9]*$")) {
			return false;
		}
		
		return true;
		
	}

}
