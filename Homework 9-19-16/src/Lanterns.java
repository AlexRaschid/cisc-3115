
public class Lanterns {

	public static void tri() {
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************");
	}
	
	public static void center1() {
		tri();
		System.out.println("* | | | | | *");
		System.out.println("*************");
		tri();
	}
	
	public static void center2() {
		tri();
		System.out.println("    *****");
		System.out.println("* | | | | | *");
		System.out.println("* | | | | | *");
		System.out.println("    *****");
		System.out.println("    *****");
	}
	
	public static void main(String[] args) {
		
		tri();
		System.out.println("");
		center1();
		System.out.println("");
		center2();
		
	}

}
