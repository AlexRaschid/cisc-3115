//Alexander Raschid
import java.io.*;
import java.util.*;
public class FindLast {

	public static void main(String[] args) throws IOException{
		Scanner kybd = new Scanner(System.in);
		
		while(true){//"C:/Users/AlexR/cisc3115/Lab 1.3/src/numbers.txt"
			BufferedReader file = new BufferedReader(new FileReader("numbers.text"));
			System.out.print("Enter a number: ");
			int input = kybd.nextInt();
			
			//Keeps track of the final posiiton
			String num;
			int count = 1,
			     pos = -1;
			while((num = file.readLine()) != null){
				if(Integer.parseInt(num) == input){
					pos = count;
				}
				count++;
			}
			
			if(pos == -1){//-1 indicates no change
				System.out.println(input + " does not appear in the file");
			} else {
				System.out.println(input + " last appears in the file at position " + pos);
			}
		}
	}
}
