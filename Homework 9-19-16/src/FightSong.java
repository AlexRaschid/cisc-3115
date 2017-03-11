
public class FightSong{

	public static void chant1(){
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}
	
	public static void chant2(){
		chant1();
		System.out.println("You're the best,");
		System.out.println("In the west.");
		chant1();
	}
	
	public static void main(String[] args) {
		chant1();
		System.out.println("");
		chant2();
		System.out.println("");
		chant2();
		System.out.println("");
		chant1();
	}

}
