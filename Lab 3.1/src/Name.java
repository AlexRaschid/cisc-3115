import java.io.*;
import java.util.*;

class Name {
	public Name(String last, String first) {
		this.last = last;
		this.first = first;
	}
	public Name(String first) {this("", first);}

	public String getFormal() {return first + " " + last;}
	public String getOfficial() {return last + ", " + first;}
	public String getInitials() {return first.toUpperCase().charAt(0) + "." +
										last.toUpperCase().charAt(0) + ".";}
	
	
	public boolean equals(Name other) {return first.equals(other.first) && last .equals(other.last);}

	public String toString() {return first + " " + last;}

	public static Name read(Scanner scanner) {
		if (!scanner.hasNext()) return null;
		String last = scanner.next();
		String first = scanner.next();
		return new Name(last, first);
	}
	
	
	private String first, last;
	

	

	public static void main(String [] args) throws Exception {
		Scanner scanner = new Scanner(new File("/Users/MainUser/Desktop/cisc 3115 files/workspace/Lab 3.1/src/names.txt"));

		int count = 0;
		
		Name name = read(scanner);
		Name previousName = null;
		while(name != null) {
			
			if(previousName != null && name.equals(previousName)) {
				System.out.println("Duplicate name \"" + name.getFormal() + "\" discovered");
				count++;
				previousName = name;
				name = read(scanner);
				continue;
			}
			System.out.println("name: " + name.getFormal());
			System.out.println("formal: " + name.getFormal());
			System.out.println("official: " + name.getOfficial());
			System.out.println("initials: " + name.getInitials());
			System.out.println();
			
			count++;
			previousName = name;
			name = read(scanner);
		}
		System.out.println("---");
		System.out.println(count + " names processed.");
	}
}