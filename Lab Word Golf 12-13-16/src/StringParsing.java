import java.util.*;
class StringParsing {
  
  public static int parseSentence(String sentence){
  	int firstLetter = 0;
  	int storedIndex = 0;
  	
		for(int pos = 0; pos <= sentence.length()-1; pos++){
			if(pos == sentence.length()-1 && sentence.charAt(sentence.length()-1) != ' '){
				sentence += " ";
			}
			
		//	System.out.println(sentence.charAt(pos));
		//	System.out.println("Last letter: " +  sentence.charAt(sentence.length()-1));
			
			if(sentence.charAt(pos) == ' '){
	
		//		System.out.print("Word passed: " + sentence.substring(firstLetter,pos) + "\n");
					
				storedIndex += parseWord( sentence.substring(firstLetter,pos) );
				pos++;
				firstLetter = pos;
				continue;
			}
			
		}  
		
		return storedIndex;
  }
  
  
  
  public static int parseWord(String word){
    int parsedWord = 1;
    
    for(int i = 0; i <= word.length()-1; i++){
          char letter = word.toLowerCase().charAt(i);
      
        if(letter == 'a' || 
           letter == 'e' || 
           letter == 'i' || 
           letter == 'o' || 
           letter == 'u'){
        	
          parsedWord *= 2;
          
        }else{
          parsedWord++;
        }
    }
     
    return parsedWord;
    
  }
  
  
  
  public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please type a real sentence");
        String sentence = console.nextLine();
        System.out.println(parseSentence(sentence));
        
        
        
        
  }
}