public class mainlp302{
	public static final int j = 0;
	public static void head(int length, int height){ // Start of head
		for (int x = 1; x <= length; x++){// top head
			System.out.print("-");
		}
		System.out.println(" ");
		//End of top head
		
		
		
		for(int z = 1; z <= height; z++){//head height || sides
			System.out.print("|");
			for (int y = 1; y <= length - 2; y++){
				System.out.print(" ");
			}
			System.out.println("|");
		}//end of head height || sides
		
		
		
		for (int x = 1; x <= length; x++){// bottom head || Chin
				System.out.print("-");
			}
		System.out.println(" ");
		// bottom head || Chin
		
}//end of head
	
	
		public static void arms_body(int bodylength){//Start method
			int s;
			for(int x = 1; x <= bodylength; x++){//For the # of body length
				
				
					if(x == 5){//If the body length is 5
						for(int z = 1; z <= 25; z++){
							//ADJUST THE # >= Z TO THE head.length
							System.out.print("-");
							
						}
						System.out.println("");
					}//end if
					
					else{// if x != 5
						for(s = 1; s <= 11; s++){/*prints spaces, aligns 
												   up to center head if head == 25
												   arms work same way.*/
							System.out.print(" ");
						}
						System.out.println(" |");
					}//end of else
					
					
			}//end of body for loop
			
		}//end method
	
	
		
		
	public static void legs(){// start legs
		for (int i = 1; i <= 8; i++) {
			
			 for (int j = 1; j <= (12 - i); j++) {
				 	System.out.print(" ");
			 }
			 System.out.print("/");
			 for (int j = 1; j <= 2 * i - 1; j++) {
				 	System.out.print(" ");
			 }
			 System.out.print("\\");
		 System.out.println();
		 }
		
		
	}//end legs
	
	
	public static void main(String[] args){
		head(25,10);
		arms_body(12);
		legs();

		
	}
	
	
	
	
	
}