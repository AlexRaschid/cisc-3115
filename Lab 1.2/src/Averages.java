//Alexander Raschid
import java.io.*;
import java.util.*;
public class Averages {
	public static void main(String[] args) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader("C:/Users/AlexR/cisc3115/Lab 1.2/src/numbers.txt"));

		String[] numberLine; //index 0 is header
		String line;
		int set = 0;
		while((line = file.readLine()) != null){
			numberLine = line.split(" ");
			String header = numberLine[0];
			String theInts = new String("");
			double totalVal = 0;
			int totalNums = 0;
			for(String n : numberLine){
				if(n == header){continue;}
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
