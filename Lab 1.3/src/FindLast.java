//Alexander Raschid
import java.io.*;
import java.util.*;
public class FindLast {

	public static void main(String[] args) throws IOException{
		while(true){
			BufferedReader file = new BufferedReader(new FileReader("C:/Users/AlexR/cisc3115/Lab 1.3/src/numbers.txt"));
			Scanner kybd = new Scanner(System.in);
			
			
			System.out.print("Enter a number: ");
			int input = kybd.nextInt();
			
			String num;//The current number on the line of the dataset
			int count = 1;//goes over each position of dataset
			int pos = -1;//Will be the final position of input in dataset
			while((num = file.readLine()) != null){
				if(Integer.parseInt(num) == input){
					pos = count;
				}
				count++;
			}
			
			if(pos == -1){
				System.out.println(input + " does not appear in the file");
			} else {
				System.out.println(input + " last appears in the file at position " + pos);
			}
		}
	}

}
