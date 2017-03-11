
public class NestedLoops {
	 
	 public static void multiTable(){
		 int j;
		 for(int i = 0; i<=12; i++){
			 for(j = 0; j<=12; j++){
				 System.out.print(j * i + " ");
			 }
			 System.out.println(" ");
		 }
		 
	 }
	
	

	public static void main(String[] args) {
		multiTable();
	}

}
