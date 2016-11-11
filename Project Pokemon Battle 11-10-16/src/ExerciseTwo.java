import java.util.Scanner;


public class ExerciseTwo {
	
	public static void damage(){
		
		System.out.println("Enter your Pokemon Stats below:");
		
		
		Scanner userInputLVL = new Scanner(System.in);
		System.out.println("What is your LVL?");
		double lvl = userInputLVL.nextDouble();// ********** USER'S LEVEL
		
		
		
		Scanner userInputATK = new Scanner(System.in);
		System.out.println("What is your Attack Level?");
		double atk = userInputATK.nextDouble();// ********** USER'S ATK
		
		
		
		Scanner userInputDEF = new Scanner(System.in);
		System.out.println("What is your Defence Level?");
		double def = userInputDEF.nextDouble();// ********** USER'S DEF
		
		
		
		Scanner userInputBASE = new Scanner(System.in);
		System.out.println("What is your Base Level?");
		double base = userInputBASE.nextDouble();// ********** USER'S BASE
		
		
		Scanner userInputSTAB = new Scanner(System.in);
		System.out.println("What is your Same Type Attack Bonus?(STAB)");
		double stab = userInputSTAB.nextDouble();// ********** USER'S STAB
		
		
		Scanner userInputHP = new Scanner(System.in);
		System.out.println("What are your Health Points? (HP)");
		double hp = userInputHP.nextDouble();// ********** USER'S BASE
		
		double modifier = stab * (  Math.random() * (   (1.0 - 0.85) + 1));
		double damage = (   (   (  ((2 * lvl) + 10)/250) * (atk / def) * base) + 2) * modifier;
		
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what is your Pokemon's stats?");
		System.out.println("Level: " + lvl);
		System.out.println("Attack: " + atk);
		System.out.println("Defence: " + def);
		System.out.println("Base: " + base);
		System.out.println("STAB: " + stab);
		System.out.println("HP: " + hp);
		System.out.println("Your Pokemon sustained " + damage + " points damage. HP is now " + (hp - damage));	
	}

	public static void main(String[] args) {
		damage();

	}

}
