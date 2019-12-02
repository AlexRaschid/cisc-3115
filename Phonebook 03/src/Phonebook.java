import java.io.*;
import java.util.*;
/** class Phonebook gives us the ability to look up a phone number */
public class Phonebook {
	
	//tree from Name to PhonebookEntry
    TreeMap<Name, PhonebookEntry> tree_map = new TreeMap<Name, PhonebookEntry>();
	
	
	public Phonebook(String fileName) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File(fileName));
	}
	
	public lookup(String firstName, String lastName) {
		
		
	}
	
}


