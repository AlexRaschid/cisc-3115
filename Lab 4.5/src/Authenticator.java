import java.util.*;
import java.io.*;

class Authenticator {
	private int SIZE = 100;
	private int LastViableIndex;
	User[] userArr = new User[SIZE];

	public Authenticator(String fileName) throws FileNotFoundException{
		Scanner s = new Scanner(new File(fileName));
		int counter = 0;
		while(s.hasNext()){
			this.userArr[counter] = userArr[counter].read(s);
			counter++;
			LastViableIndex = counter;
		}
		s.close();
	}

	
public void authenticate(String inputName, String inputPass) throws Exception{
		//System.out.println("username? " + inputName);
		//System.out.println("password? " + inputPass);
		
			int counter = 0;
			while(counter < LastViableIndex){
			    //try{
			    //System.out.println(userArr[counter].toString());
				if(userArr[counter].getUsername().equals(inputName) &&
						!userArr[counter].verifyPassword(inputPass)){
					throw new Exception("Invalid password - hint: " + userArr[counter].getHint());
				}else if(userArr[counter].getUsername().equals(inputName) &&
						userArr[counter].verifyPassword(inputPass)){
						//System.out.println("Welcome to the system");
					}
				counter++;
				
			    /*}catch(Exception e){//Correct user, wrong pass
			        System.out.println(e.getMessage());
			        break;
		        }*/
			}
			

	}

}