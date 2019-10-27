import java.io.*;
import java.util.*;

public class DataChecker {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("C:/Users/AlexR/cisc3115/Lab 4.2/src/numbers.txt"));
		int currentLine = 0;
		int totalNum = 0;
		double numTotal = 0;
		int validLines = 0;
		int corruptLines = 0;
		
		while (fileScanner.hasNextLine()){                // while there are lines left to read
		    currentLine++;
			String line = fileScanner.nextLine();        // read next line of file
		    Scanner lineScanner = new Scanner(line);    // set up a Scanner to read the 'contents of the line'
		    try {
		    	if(lineScanner.hasNextInt() == false) {
	    			throw new Exception("*** Error (line "+ currentLine +"): Line is empty - average can't be taken");
	    		}
	    		
		    	int header = Integer.valueOf(lineScanner.next());//reads header integer
		    	//System.out.println(line);
		    	//System.out.println(header);
		    	if(header < 0) {throw new Exception("*** Error (line "+ currentLine +"): Corrupt line - negative header value");}
	    		if(header == 0) {throw new Exception("*** Error (line "+ currentLine +"): Header value of 0 - average can't be taken");}
		    	
		    while(lineScanner.hasNextInt()) {
	    		totalNum++;
	    		numTotal += (double)Integer.valueOf(lineScanner.next());
	    		
	    	}
		    //System.out.println(totalNum);
		    if(totalNum < header) {throw new Exception("*** Error (line "+ currentLine +"): Corrupt line - fewer values than header");}
	    	if(totalNum > header) {throw new Exception("*** Error (line "+ currentLine +"): Corrupt line - extra values on line");}
	    	}catch(Exception e) {
	    		System.out.println(e.getMessage());
	    		totalNum = 0;
	    		numTotal = 0;
	    		corruptLines++;
	    		continue;
	    	}
		    //Integer.valueOf(
	    	System.out.println("The average of the values on line "+ currentLine +" is " + (numTotal/totalNum));
	    	validLines++;
	    	totalNum = 0;
		}
    	System.out.println("\nThere were "+ validLines +" valid lines of data");
    	System.out.println("There were "+ corruptLines +" corrupt lines of data");
		fileScanner.close();
	}
	
}
