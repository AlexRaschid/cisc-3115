//Alexander Raschid
import java.io.*;
import java.util.*;
public class Averages {
	public static void main(String[] args) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader("C:/Users/AlexR/cisc3115/Lab 1.2/src/numbers.txt"));

		String[] numberLine; //index 0 is header
		String line;
		int set = 0;//Each set of numbers
		while((line = file.readLine()) != null){//Loops through file splitting each line
			numberLine = line.split(" ");
			
			String header = numberLine[0],
					theInts = new String("");
			
			double totalVal = 0.0;//Will be used to calculate average
			int totalNums = 0;
			for(String n : numberLine){//Loops over each number, adds them to the total keeps track of how many
										//numbers covered
				if(n == header){continue;}//continuing past the header 
				totalVal += Double.parseDouble(n);
				theInts += " " + n;
				totalNums++;
			}		
			
			System.out.println("The average of the " + header + " integers" + theInts + " is " + (totalVal/totalNums));
			set++;
		}
		System.out.print(set + " sets of numbers processed");	
	}
}
