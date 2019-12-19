import java.io.*;
import java.util.*;
/** class Phonebook gives us the ability to look up a phone number */
public class Phonebook {

   /** main declares 2 parallel arrays, calls read method, loops to search
   */
	
   public static void main(String[] args) throws IOException  {
	   try{  
          final int SIZE=100;
          ArrayList<PhonebookEntry> entries = new ArrayList<PhonebookEntry>(SIZE);
          String database = "C:/Users/AlexR/cisc3115/Phonebook 03/src/phonebook.txt";
          int numElts = read(database,entries);

	  Scanner keyboard = new Scanner(System.in);
	  System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");

	  int lookedUp = 0;
	  while (keyboard.hasNext()) {
		 String input = keyboard.next();
		 switch(input.toLowerCase().charAt(0)){
		 	case 'l':
		 		 System.out.print("last name? ");
		 		 String lastName = keyboard.next();
		 		 System.out.print("first name? ");
		 		 String firstName = keyboard.next();
	             String number = lookup(numElts, lastName, firstName, entries);
	    	     if (number.equals(""))
	    	        System.out.println("-- Name not found\n");
	    	     else
	    	        System.out.println(firstName + " " + lastName + "\'s phone number is " + number + "\n");
	    	     	lookedUp++;
	    	     System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");
	    	     break;
		 	case 'q':
		 		//System.out.println("\n" + lookedUp + " lookups performed");
		 		System.exit(0);
		 	default:
		 		System.out.println("Error: Wrong selection, please try again");
		 		System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");
		 }
	  }
	  keyboard.close();
   }catch(FileNotFoundException e){
	   System.out.print("*** IOException *** phonebook.text (No such file or directory)");
   }catch(Exception e){
	   //prints the message in read()
	   System.exit(0);
   }
   }

   /** read method reads from a file into the first/last names and numbers arrays
   @param filename  name of file with input
   @param names this is an empty array to be filled
   @param numbers this is an empty array to be filled
   @return int returns the number of data elements read in (IMPORTANT)
   */
   public static int read(String database, ArrayList<PhonebookEntry> entries) throws IOException  {
   	   int count=0; // this is the number of lines read in  
	   Scanner scanner = new Scanner(new File(database));
	   // read until EOF
	   while(scanner.hasNext()) {
	        try{ 
				   if (count >= entries.size()) {
			        	throw new Exception("*** Exception *** Phonebook capacity exceeded - increase size of underlying array");
			        }
		        }catch(Exception e){
		        	System.out.println(e.getMessage());
		        }
	        
	        
	        //System.out.println(scanner.hasNextLine());
			//entries[count] = entries[count].read(scanner);
			//System.out.println( );
			//System.out.println(count + " " + entries[count]); //TODO: Fix it returning null for some reason
			//System.out.println(entries[count].getPhoneNumber().toString());
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
   public static String lookup(int size, String lastName, String firstName, PhonebookEntry[] entries)  {
	   for(int i = 0; i < size; i++){
		   if(entries[i].getName() == null){return "";} //Handles a null pointer
		   if(entries[i].getName().equals(new Name(lastName,firstName))){
			   return entries[i].getPhoneNumber().toString();
		   }
		   
	   } 
	   return "";
	   /*for (int i=0; i<size; i++){
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
   		*/
   }
   
   
}


