import java.util.*;
public class StringParsing {

		
		
	  public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        System.out.println("Please type a real sentince");
	        String userInput = console.nextLine();
	        console.close();
	        System.out.println(parseSentince(userInput));
	        
	        
	  }
	  
	  
	  
	    public static int parseSentince(String sentince){
	    int parsedString = 1;
	    int parsedIndexString = 0;
	    
	    for(int i = 0; i <= sentince.length()-1; i++){
	      
			if(sentince.charAt(i) == ' '){
				//Skip to the next word.
				parsedIndexString += parsedString;
				parsedString = 1;
				System.out.println("Next word");
				continue;
				
				
	        
	        }else if(sentince.toLowerCase().charAt(i) == 'a' ||
	           sentince.toLowerCase().charAt(i) == 'e' || 
	           sentince.toLowerCase().charAt(i) == 'i' || 
	           sentince.toLowerCase().charAt(i) == 'o' || 
	           sentince.toLowerCase().charAt(i) == 'u'){
	        	
	          parsedString *= 2;
	          
	          System.out.println("Multiplied");
	          
	        }else{
	          parsedString++;
	          System.out.println("Added");
	        }
	    }
	    
	    return parsedString + parsedIndexString;
	    
	  }
	  
	  
	  
}
