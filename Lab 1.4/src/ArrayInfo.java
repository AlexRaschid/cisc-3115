//Alexander Raschid Lab 1.14
import java.io.*;
import java.util.*;
public class ArrayInfo {
	public static void main(String[] args) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader("C:/Users/AlexR/cisc3115/Lab 1.4/src/numbers.txt"));
		int header = Integer.parseInt(file.readLine());
		int mid = (header - 1) / 2;
		
		double[] numberLine = new double[header];
		String num;
		int index = 0;
		while((num = file.readLine()) != null){//Adds each double to the array numberLine
			numberLine[index] = Double.parseDouble(num);
			index++;
		}
		
		//Formats the array to a string to meet format on codelab
		StringBuilder theArray = new StringBuilder();
		theArray.append("{");
		for(double v : numberLine){
			theArray.append(v);
			if(v == numberLine[header - 1]){break;}//Breaks if at last element to prevent needles ', '
			else{theArray.append(", ");}
		}
		theArray.append("}");
	
		
		//Finds Smallest/Biggest numbers
		int smallestPos = 0, biggestPos = 0;
		double smallest = numberLine[0], 
		        biggest = numberLine[0];
		for(int i = 1; i < header; i++){//Starts at 1 since we assumed 0 was smallest/biggest
			if(numberLine[i] > biggest){
				biggest = numberLine[i];
				biggestPos = i;
			} else if(numberLine[i] < smallest){
				smallest = numberLine[i];
				smallestPos = i;
			}
		}
		
		
		System.out.println("The array: " + theArray.toString() + " contains " + header + " elements");
		System.out.println("The first element of the array is " + numberLine[0]);
		System.out.println("The last element of the array is " + numberLine[header - 1] + " at position " + (header - 1));
		System.out.println("The middle element of the array is " + numberLine[(int)mid] + " and is at position " + (int)mid);
		System.out.println("The largest element of the array is " + biggest + " and is at position " + biggestPos);
		System.out.println("The smallest element of the array is " + smallest + " and is at position " + smallestPos);
	}
}
