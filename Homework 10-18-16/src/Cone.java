
public class Cone {


	// one class needs to have a main() method
	  
	  
	  public static void qBar(){
	    System.out.print("|");
	    for(int i = 1; i <= 8; i++){
	    	System.out.print("\"");
	    }
	    System.out.print("\'");
	    System.out.println("|");
	  }// End of qBar
	  
	  
	  
	  public static void downV(){
		  int a = 3;
		  for (int i = 7; i >= 1; i--) { 
				 if(a >= i){
					 
				 }
				 else{
					 for (int u = 1; u <= (8 - i); u++) {
						 	System.out.print(" ");
					 }//End of u
				 }
				 
				 
					 if(a >= i){
					 }
					 else{
						 for (int j = 0; j < 1; j++) {
							 	System.out.print("\\");
						 }
					 }//end of if
					 
					 
				 for (int k = 1; k <= 2 * i - 7; k++  ) {
					 	System.out.print(":");
					 	
				 }
				 
					 if(a >= i){
					 }
					 else{
						 for (int p = 0; p < 1; p++) {
							 	System.out.print("/");
						 }
					 }//end of if
					 
					 
				if(a >= i ){
					
				}
				else{	 
					System.out.println("");
				}
			 }
	  }// End of DownV
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  public static void inverseV(){
		  int a = 3;
		  for (int i = 8; i >= 1; i--) { 
			  
			  
				 if(a + 1 >= i){}
				 else{
					 for (int u = 1; u <= i - 4; u++) {
						 	System.out.print(" ");
					 }
				 }//end of if
				 
				 
					 if(a + 1 >= i){}
					 else{
						 for (int j = 0; j < 1; j++) {
							 	System.out.print("/");
						 }
					 }//end of if
					 
					 
					 if(a + 1 >= i){}
					 else{
					 for (int j = 15; j >= 2 * i - 1; j--) {
						 	System.out.print(":");
					 }
					 }//end of if
					 
					 
					 
					 if(a + 1 >= i){}
					 else{
						 for (int p = 0; p < 1; p++) {
							 	System.out.print("\\");
						 }
					 }//end of if
					 
					 
				 
					 if(a + 1 >= i ){}
						else{	 
							System.out.println("");
						}
				
			 }
	  }// End of inverseV
	  
	  
	  public static void drawHGlass(){
		qBar();
	    downV();
	    inverseV();
	    qBar();
	    
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  public static void main(String[] args){	
	  		drawHGlass();
	  }
	
	
}