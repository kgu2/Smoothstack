import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Gets list of file/directory names under a given directory
 * 
 * @author kgu82
 *
 */
public class DirectoryNames {

	public static void main(String[] args) {
		try {
			// prompts user for directory path input
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Directory path: ");
			String directoryPath = scan.nextLine();
			File directory = new File(directoryPath);

			// if directory path does not exist, continusously prompt user for input
			while(!directory.exists()) {
				System.out.println("Directory does not exist, try again");
				directoryPath = scan.nextLine();
				directory = new File(directoryPath);
			}

			List<String> filenames = getNames(directory);
			for(String name: filenames) {
				System.out.println(name);
			}

			scan.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method gets a list of all of the file names in the given File directory
	 */
	public static List<String> getNames(File directory){
		List<String> fileNames = new ArrayList<String>();
		for(File f : directory.listFiles())
		{
			fileNames.add(f.getName());
		}
		return fileNames;
	}
}
