
public class TwoRockets {
	
	public static void tops(){
		System.out.println("   /\\       /\\");
		System.out.println("  /  \\     /  \\");
		System.out.println(" /    \\   /    \\");
	}
	
	public static void boxs(){
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
	}
	
	public static void boxtxt(){
		System.out.println("+------+ +------+");
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
		System.out.println("+------+ +------+");
	}
	
	
	
	
	public static void main(String[] args) {
		tops();
		boxs();
		boxtxt();
		boxs();
		tops();
	}
	
	/* Using static methods, you can remove the redundancy of writing more code.
	 * Instead, you can use the block of code and call it multiple times. */

}
