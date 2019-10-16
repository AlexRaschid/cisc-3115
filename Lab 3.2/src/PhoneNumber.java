import java.io.*;
import java.util.*;
class PhoneNumber {
	private String number; //format (nnn)nnn-nnnn
	
	public PhoneNumber(String n) {this.number = n;}
	public String getAreaCode() {return number.substring(1, 4);}
	public String getExchange() {return number.substring(5,8);}
	public String getLineNumber() {return number.substring(9,number.length());}
	public boolean isTollFree() {return (number.charAt(1) == '8');}
	
	
	
	public boolean equals(PhoneNumber other) {return number.equals(other.number);}
	public String toString() {return number;}
	
	public static PhoneNumber read(Scanner scanner) {
		if (!scanner.hasNext()) return null;
		String n = scanner.next();
		return new PhoneNumber(n);
	}
	
	public static void main(String [] args) throws Exception {
		Scanner scanner = new Scanner(new File("numbers.text"));
		int count = 0;
		
		PhoneNumber number = read(scanner);
		PhoneNumber previousNumber = null;
		while(number != null) {
			
			if(previousNumber != null && number.equals(previousNumber)) {
				System.out.println("Duplicate phone number \"" + number.toString() + "\" discovered");
				count++;
				previousNumber = number;
				number = read(scanner);
				continue;
			}
			System.out.println("phone number: " + number.toString());
			System.out.println("area code: " + number.getAreaCode());
			System.out.println("exchange: " + number.getExchange());
			System.out.println("line number: " + number.getLineNumber());
			System.out.println("is toll free: " + number.isTollFree());
			System.out.println();
			
			count++;
			previousNumber = number;
			number = read(scanner);
		}
		System.out.println("---");
		System.out.println(count + " phone numbers processed.");
	}
	
}