
public class drawThis22 {
	
	 public static void drawThis22() {
		 for (int i = 1; i <= 10; i++) {
		 for (int j = 1; j <= (10 - i); j++) {
		 System.out.print(" ");
		 }
		 for (int j = 1; j <= 2 * i - 1; j++) {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
	} 
	
	
	public static void main(String[] args) {
		drawThis22();

	}

}
