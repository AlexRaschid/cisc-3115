//Alexander Raschid
import java.util.*;
public class InfoOf3 {

	public static void main(String[] args){
		Scanner kybd = new Scanner(System.in);
		System.out.print("First Number?: ");
		int firstNum = kybd.nextInt();
		System.out.print("Second Number?: ");
		int secondNum = kybd.nextInt();
		System.out.print("Third Number?: ");
		int thirdNum = kybd.nextInt();
		
		//System.out.println("The nums: " + firstNum + secondNum + thirdNum);
		System.out.println("allAreEqual: " + allAreEqual(firstNum,secondNum,thirdNum));
		System.out.println("twoAreEqual: " + twoAreEqual(firstNum,secondNum,thirdNum));
		System.out.println("noneAreEqual: " + noneAreEqual(firstNum,secondNum,thirdNum));
		System.out.println("areAscending: " + areAscending(firstNum,secondNum,thirdNum));
		System.out.println("areDescending: " + areDescending(firstNum,secondNum,thirdNum));
		System.out.println("strictlyAscending: " + strictlyAscending(firstNum,secondNum,thirdNum));
		System.out.println("strictlyDescending: " + strictlyDescending(firstNum,secondNum,thirdNum));
	}
	
	/** Checks if all inputs are equal
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean allAreEqual(int a, int b, int c){
		if(a == b && a == c && b == c){
			return true;
		} else {
			return false;
		}	
	}
	
	/** Checks if only 2 inputs are equal
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean twoAreEqual(int a, int b, int c){
		int counter = 0;
		if(a == b){counter++;} 
		else if (a == c){counter++;}
		else if (b == c){counter++;};
		switch(counter){
			case 2:
				return true;
			default:
				return false;
		}
	} // false if all three are equal
	
	/** Checks if none of the inputs are equal
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean noneAreEqual(int a, int b, int c){
		int counter = 0;
		if(a == b){counter++;} 
		else if (a == c){counter++;}
		else if (b == c){counter++;};
		switch(counter){
			case 0:
				return true;
			default:
				return false;
		}
	}
	
	/** Checks if the input numbers are in ascending order
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean areAscending(int a, int b, int c){
		if(a <= b &&  b <= c){
			return true;
		} else{
			return false;
		}
	} // true if a <= b <= c
	
	/** Checks if the input numbers are in descending order
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean areDescending(int a, int b, int c){
		if(a >= b && b >= c){
			return true;
		} else{
			return false;
		}
	} // true if a >= b >= c
	
	/** Checks if the input numbers are in a strict ascending order
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean strictlyAscending(int a, int b, int c){
		if(a < b && b < c){
			return true;
		} else{
			return false;
		}
	} // true if a < b < c

	/** Checks if the input numbers are in a strict descending order
	 * 	@param a,b,c any input number
	 * @return boolean
	 * */
	public static boolean strictlyDescending(int a, int b, int c){
		if(a > b && b > c){
			return true;
		} else{
			return false;
		}
	} // true if a > b > c
}
