import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhonebookEntry{
	private Name name;
	private PhoneNumber phoneNumber;
	
	public PhonebookEntry(Name n, PhoneNumber p){
		this.name = n;
		this.phoneNumber = p;
	}
	
	public Name getName() {return this.name;}
	public PhoneNumber getPhoneNumber() {return this.phoneNumber;}
	
	public void call() {
		boolean isTollFree = this.phoneNumber.isTollFree();
		if(isTollFree) {
			System.out.println("Dialing (toll-free) " + this.name.getFormal() + ": " + this.phoneNumber.toString());
		} else {
			System.out.println("Dialing " + this.name.getFormal() + ": " + this.phoneNumber.toString());
		}
		
	}
	
	public String toString() {return this.name.getFormal();}
	
	public boolean equals(PhonebookEntry other) {
		if(name.equals(other.name) && !(phoneNumber.equals(other.phoneNumber))) {
			System.out.println("Warning duplicate name encountered \"" + this.name.getFormal()+ ": " +
					this.phoneNumber.toString() + "\" discovered");
			
			return false;
		} else if(name.equals(other.name) && phoneNumber.equals(other.phoneNumber)) {
			System.out.println("Duplicate phone book entry \"" + this.name.getFormal() + ": " +
					this.phoneNumber.toString() + "\" discovered");
			
			return true;
		}
		return false;
	}
	
	public static PhonebookEntry read(Scanner scanner) {
		if (!scanner.hasNext()) return null;
		String last = scanner.next();
		String first = scanner.next();
		String number = scanner.next();
		
		return new PhonebookEntry(new Name(last, first), new PhoneNumber(number));
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("/Users/MainUser/Desktop/cisc 3115 files/workspace/Lab 3.3/src/phonebook.txt"));
		
		int count = 0;
		
		PhonebookEntry pbe = read(scanner);	
		PhonebookEntry previous_pbe = null;
		while(pbe != null) {
			
			if(previous_pbe != null && pbe.equals(previous_pbe)) {
				count++;
				previous_pbe = pbe;
				pbe = read(scanner);
				continue;
			}
			
			
			System.out.println("phone book entry: " + pbe.name.getFormal() + ": " + pbe.phoneNumber.toString());
			pbe.call();
			System.out.println();
			
			
			count++;
			previous_pbe = pbe;
			pbe = read(scanner);
		}
		
		System.out.println("---");
		System.out.println(count + " phone book entries processed.");
		
	}
	
	
	
}
