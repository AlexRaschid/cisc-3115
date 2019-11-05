import java.io.*;
import java.util.*;


public class UserApp {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(new File("C:/Users/AlexR/cisc3115/Lab 4.3/src/users.txt"));
		int SIZE = 4;
		User u[]= new User[SIZE];
		int count = 0;
		//Scanner lineScanner = new Scanner(s.nextLine());
		
		
		while(s.hasNext()){
			u[count] = new User();
			u[count].read(s);
			
			System.out.println("User " + u[count].toString() + " hint: " + u[count].getHint());
			if(u[count].verifyPassword(u[count].toString())){
				System.out.println("*** Error the password should not be the same as the user name \n");
			} else{
				System.out.println("OK -- the password is different than the user name \n");
			}
			
			count++;
		}
	}
}
