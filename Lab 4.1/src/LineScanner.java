import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LineScanner {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("C:/Users/AlexR/cisc3115/Lab 4.1/src/numbers.txt"));
		int currentLine = 0;
		int totalNum = 0;
		
		while (fileScanner.hasNextLine()){                // while there are lines left to read
		    currentLine++;
			String line = fileScanner.nextLine();        // read next line of file
		    Scanner lineScanner = new Scanner(line);    // set up a Scanner to read the 'contents of the line'
	    	//System.out.println(line);
		   
	    	while(lineScanner.hasNextInt()) {
	    		totalNum++;
	    		lineScanner.next();	
	    	}
		   
	    	System.out.println("There are " + totalNum + " numbers on line " + currentLine);
	    	totalNum = 0;
		}
    	//System.out.println("totl"+totalNum);
    	//System.out.println("line"+currentLine);
		fileScanner.close();
	}
	
}
