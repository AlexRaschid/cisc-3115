import java.io.*;
import java.util.Scanner;

/** class Phonebook gives us the ability to look up a phone number */
public class Phonebook {

   /** main declares 2 parallel arrays, calls read method, loops to search
   */
   public static void main(String[] args) throws IOException  {

          final int SIZE=100;
          String[] lastNames = new String[SIZE];
          String[] firstNames = new String[SIZE];
          String[] numbers = new String[SIZE];

          int numElts = read("C:/Users/AlexR/cisc3115/Phonebook 01/src/phonebook.txt",lastNames,firstNames,numbers);

	  Scanner keyboard = new Scanner(System.in);
	  System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");

	  int lookedUp = 0;
	  int reverseLookedUp = 0;
	  while (keyboard.hasNext()) {
		 String input = keyboard.next();
		 switch(input.toLowerCase().charAt(0)){
		 	case 'l':
		 		 System.out.print("last name? ");
		 		 String lastName = keyboard.next();
		 		 System.out.print("first name? ");
		 		 String firstName = keyboard.next();
	             String number = lookup(lastNames, firstNames, numbers, numElts, lastName, firstName);
	    	     if (number.equals(""))
	    	        System.out.println("-- Name not found\n");
	    	     else
	    	        System.out.println(firstName + " " + lastName + "\'s phone number is " + number + "\n");
	    	     	lookedUp++;
	    	     System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");
	    	     break;
		 	case 'r':
		 		System.out.print("phone number (nnn-nnn-nnnn)? ");
		 		String inputNum = keyboard.next();
		 		String reverseResult = reverseLookup(inputNum, numbers, lastNames, firstNames, SIZE);
		 		if (reverseResult.equals(""))
	    	        System.out.println("-- Phone number not found\n");
	    	     else
	    	        System.out.println(inputNum + " belongs to " + reverseResult + "\n");
		 			reverseLookedUp++;
		 		
		 		System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");
		 		break;
		 	case 'q':
		 		System.out.println("\n" + lookedUp + " lookups performed");
		 		System.out.println(reverseLookedUp + " reverse lookups performed");
		 		System.exit(0);
		 	default:
		 		System.out.println("Error: Wrong selection, please try again");
		 		System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");
		 }
	  }
	  keyboard.close();
   }

   /** read method reads from a file into the first/last names and numbers arrays
   @param filename  name of file with input
   @param names this is an empty array to be filled
   @param numbers this is an empty array to be filled
   @return int returns the number of data elements read in (IMPORTANT)
   */
   public static int read(String filename, String[] lastNames, String[] firstNames, String[] numbers) throws IOException  {
   	   int count=0; // this is the number of lines read in  
	   Scanner scanner = new Scanner(new File(filename));
	   // read until EOF
	   while(scanner.hasNext()) {
	        if (count >= lastNames.length) {
		   System.out.println("Phonebook capacity exceeded - increase size of underlying array");
		   System.exit(1);
		   }
			lastNames[count]=scanner.next();
			firstNames[count]=scanner.next();
			numbers[count]=scanner.next();
			count++;
		}
	   		return count;
	    }

   /** lookup performs a linear search to find the name.
   @param lastNames
   @param firstNames
   @param numbers
   @param size
   @param lastName 
   @param firstName  
   @return String representing the phone number of the name searched
   */
   public static String lookup(String[] lastNames, String[] firstNames, String[] numbers, int size, String lastName, String firstName)  {
	    for (int i=0; i<size; i++){
	        if (lastNames[i].equals(lastName)){
	        	if(firstNames[i].equals(firstName)){
	        		return numbers[i];
	        	}
	        	// if fall out, not found
	    	    return "";
	        }
	    }
	    // if fall out, not found
	    return "";
   }
   
   
   
   /** reverseLookUp performs a linear search to find the number.
   @param inputNum
   @param numbers
   @param lastNames
   @param firstNames
   @param size
   @return String representing the full formatted name of the number searched
   */
   public static String reverseLookup(String inputNum, String[] numbers, String[] lastNames, String[] firstNames, int size){
	   for (int i=0; i<size; i++){
		   	if(inputNum == null || numbers[i] == null){return "";} //Handles a null pointer
	        if (numbers[i].equals(inputNum)){
	        	return (lastNames[i] + ", " + firstNames[i]);
	        } 
	   }
	    // if fall out, not found
	    return "";  
   }
}