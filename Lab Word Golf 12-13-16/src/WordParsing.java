import java.util.*;
class Main {
  
  
  public static int parseWord(String word){
    int parsedWord = 1;
    
    for(int i = 0; i <= word.length()-1; i++){
      
        if(word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e' || word.toLowerCase().charAt(i) == 'i' || word.toLowerCase().charAt(i) == 'o' || word.toLowerCase().charAt(i) == 'u'){
        	
          parsedWord *= 2;
          
        }else{
          parsedWord++;
        }
    }
    
    return parsedWord;
    
  }
  
  
  
  public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please type a real word");
        String word = console.nextLine();
        console.close();
        System.out.println(parseWord(word));
        
        
        
        
  }
}