import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Append text to an existing file
 * 
 * @author kgu82
 *
 */
public class AppendText {

	public static void main(String[] args) {
		try {
			// prompts user for file name input
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter file name: ");
			
			String fileName = scan.nextLine();
			File file = new File(fileName);
			
			// if file does not exist, continuously prompt user 
			while(!file.isFile()) {
				System.out.println("File does not exist, try again");
				fileName = scan.nextLine();
				file = new File(fileName);
			}
			
			System.out.println("Enter text to append: ");
			String text = scan.nextLine();
			
			appendText(file, text);
			scan.close();

		} catch(Exception e) {
			System.out.println(e);
		} 
	}

	/**
	 * This method appends given text to a File
	 */
	public static void appendText(File fileName, String text) {
		try {
			FileWriter myWriter = new FileWriter(fileName, true);
			myWriter.write(text);
			myWriter.close();
			System.out.println("Successfully appended \"" + text + "\" + to " + fileName);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
