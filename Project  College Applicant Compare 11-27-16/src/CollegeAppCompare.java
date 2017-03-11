import java.util.*;

public class CollegeAppCompare {
	
	public static void compare(){
		
		Scanner gpa = new Scanner(System.in);
		System.out.println("Enter the GPA of Student A");
		double gpaA = gpa.nextDouble();
		System.out.println("Enter the GPA of Student B");
		double gpaB = gpa.nextDouble();
		
		Scanner sat = new Scanner(System.in);
		System.out.println("Enter the SAT Score of Student A");
		double satA = sat.nextDouble();
		System.out.println("Enter the SAT Score of Student B");
		double satB = sat.nextDouble();
		
		Scanner act = new Scanner(System.in);
		System.out.println("Enter the ACT Score of Student A");
		double actA = act.nextDouble();
		System.out.println("Enter the ACT Score of Student B");
		double actB = act.nextDouble();
		
		int studentA = 0;
		int studentB = 0;
		
		if(gpaA > gpaB){
			studentA += 1;
			
		}else if(gpaB > gpaA){
			studentB += 1;
			
		}else {
			//if equal, do nothing
		}
		
		
		if(satA > satB){
			studentA += 1;
			
		}else if(satB > satA){
			studentB += 1;
			
		}else {
			//if equal, do nothing
		}
		
		
		if(actA > actB){
			studentA += 1;
			
		}else if(actB > actA){
			studentB += 1;
			
		}else {
			//if equal, do nothing
		}
		
		
		if(studentA > studentB){
			System.out.println("Student A is more Qualified.");
			
		}else if(studentA < studentB){
			System.out.println("Student B is more Qualified.");
			
		}else {
			
			System.out.println("Both Student A and B are equally as Q9ualified.");
		}
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		compare();

	}

}
