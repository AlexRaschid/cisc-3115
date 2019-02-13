//Alexander Raschid
//EMPLID: 23628311



// Contestant Database - using public data members
//	readData() using a StringTokenizer object

//needed in order to use the Scanner class
import java.util.Scanner;
//needed in order to use the StringTokenizer class
import java.util.StringTokenizer;
//import java.util.*;	//could use the wild card

//needed for File I/O
import java.io.*;

public class pgm06_01_01AllClassPublic {

	public static void main(String[] args) throws IOException
	{
		//constant definitions
		final int NUMCONS = 50;			//maximum number of contestants

		//variable declarations
		int num;						//number of contestants
		char choice;					//menu selection choice
		boolean notDone = true;		//loop control flag
	    
		//declare the contestant database
		ContestantPub[] contestant = new ContestantPub[NUMCONS];

		//Create a Scanner object for the keyboard
		Scanner keyboard = new Scanner(System.in);

		//create an output file object
	    //PrintWriter outputFile = new PrintWriter("C:/BC/CISC3115/pgms/Chapter_06/prj06_01AllClassPublic/myoutput.txt");
		//PrintWriter outputFile = new PrintWriter("myoutput.txt");
		PrintWriter outputFile = new PrintWriter(System.out);

		/* first part */
		/* fill the database */
		num = readData(contestant);

		//print the database
		printDatabase(outputFile,contestant,num);
	
		/* second part */
		/* call functions to read and process requests */
	    
		do {
			//print the menu
			printMenu();

			//prompt to make a selection
			System.out.print("enter selection: ");
			//read the selection
			choice = keyboard.next().charAt(0);
	        
			//process the selection
			switch(choice)
			{
				case 'Q':
				case 'q':
					notDone = false;
					break;
				case 'A':
				case 'a':
					findAge(keyboard,contestant,num);
					break;
				case 'G':
				case 'g':
					findGender(keyboard,contestant,num);
					break;
				case 'H':
				case 'h':
					findHairColor(keyboard,contestant,num);
					break;
				case 'T':
				case 't':
					findTitle(keyboard,contestant,num);
					break;
				case 'S':
				case 's':
					findSalary(keyboard,contestant,num);
					break;
				default:
					System.out.println("Incorrect value; try again");
					break;
			}
		} while (notDone);

		//print to console to show program completion
		System.out.println("The program is terminating");

		//close the keyboard
		keyboard.close();
	    
		//close the output file
		outputFile.close();
	}

	/* Method readData() - using a StringTokenizer object */
	public static int readData(ContestantPub[] contestant) throws IOException
	{
		//local variable
		int count = 0;
		String line;
		String tempStr;
		
		//open the contestant input file
		//File myFile = new File("C:/BC/CISC3115/pgms/Chapter_06/prj06_01AllClassPublic/myinput.txt");
		File myFile = new File("myinput.txt");

		//Create a Scanner object to read the input file
		Scanner cFile = new Scanner(myFile);
		//Scanner cFile = new Scanner(System.in);

		while (cFile.hasNext())
		{
			//create a new Contestant object
			NamePub myName = new NamePub();
			JobInfoPub myJob = new JobInfoPub();
			PersonalInfoPub myInfo = new PersonalInfoPub();
			ContestantPub myContestant = new ContestantPub();

			//read next line of data 
			line = cFile.nextLine();
			StringTokenizer myLine = new StringTokenizer(line);
	        
			//extract the data from the line read
			myName.last = myLine.nextToken();			//extract last name
			myName.first = myLine.nextToken();  		//extract first name
			tempStr = myLine.nextToken();				//extract gender
			myInfo.gender = tempStr.charAt(0);			//extract the character
			myInfo.hairColor = myLine.nextToken();		//extract the hair color
			tempStr = myLine.nextToken();				//extract age
			myInfo.age = Integer.parseInt(tempStr);		//convert to integer
			myJob.title = myLine.nextToken();			//extract job title
			tempStr = myLine.nextToken();				//extract salary
			myJob.salary = Double.parseDouble(tempStr);	//convert to double
			
			//set the Contestant object components
			myInfo.job = myJob;							//set the JobInfo component
			myContestant.name = myName;					//set the Name component
			myContestant.personal = myInfo;				//set the PersonalInfo component
		    
			//set the array element
			contestant[count] = myContestant;

			count++;									//increment the contestant count
		}
      
		//close the contestant input file
		cFile.close();

		return count;
	}

	/* Method printDatabase() */
	public static void printDatabase(PrintWriter dbFile, ContestantPub[] contestant, int num)
	{
		//print table title
		dbFile.println("\t\tContestants in the Database");
		dbFile.println();
		//print table column headings
		dbFile.printf("%-20s%-7s%-11s%-4s%-10s%-10s",
				"Name","Gender","Hair Color","Age","Title","Salary");
		dbFile.println();

		for (int count = 0; count < num; count++)
		{
			dbFile.printf("%-10s", contestant[count].name.first);
			dbFile.printf("%-10s", contestant[count].name.last);
			dbFile.printf("%-7c", contestant[count].personal.gender);
			dbFile.printf("%-11s", contestant[count].personal.hairColor);
			dbFile.printf("%-4d", contestant[count].personal.age);
			dbFile.printf("%-10s", contestant[count].personal.job.title);
			dbFile.printf("$%9.2f", contestant[count].personal.job.salary);
			dbFile.println();
		}
		dbFile.flush();		//flush the output file buffer
	}

	/* Method printMenu() */
	public static void printMenu()
	{
		System.out.println("\n");
		System.out.println("To obtain a list of contestants with a given");
		System.out.println("trait, select a trait from the list and type in");
		System.out.println("the character corresponding to that trait.");
		System.out.println("To quit, select Q.");
		System.out.println("\t****************************");
		System.out.println("\t    List of Choices         ");
		System.out.println("\t****************************");
		System.out.println("\t     Q -- quit");
		System.out.println("\t     A -- age");
		System.out.println("\t     G -- gender");
		System.out.println("\t     H -- hair color");
		System.out.println("\t     T -- title");
		System.out.println("\t     S -- salary");
		System.out.println("\n\n\tEnter your selection: ");
	}
	
	/* Method findAge() */
	public static void findAge(Scanner keyboard, ContestantPub[] contestant, int num)
	{
		int agewanted,found=0;

		System.out.println();
		System.out.print("Enter the age you want: ");
		agewanted = keyboard.nextInt();

		System.out.println();
		System.out.println("Contestants whose age is " + agewanted);
		for (int count = 0; count < num; count++)
			if (contestant[count].personal.age == agewanted)
			{
				System.out.println(contestant[count].name.first + " "
						+ contestant[count].name.last);
				found++;
			}
		if (found == 0)
			System.out.println("No contestants of this age");
		else
			System.out.println(found + " contestants found");

		// give user a chance to look at output before printing menu
		pause(keyboard);
	}

	/* Method pause() */
	public static void pause(Scanner keyboard)
	{
		String tempStr;
		System.out.println();
		System.out.print("press ENTER to continue");
		tempStr = keyboard.nextLine();		//flush previous ENTER
		tempStr = keyboard.nextLine();		//wait for ENTER
	}
	
	public static void findGender(Scanner keyboard, ContestantPub[] contestant, int num)
	{
	}

	public static void findHairColor(Scanner keyboard, ContestantPub[] contestant, int num)
	{
	}

	public static void findTitle(Scanner keyboard, ContestantPub[] contestant, int num)
	{
	}

	public static void findSalary(Scanner keyboard, ContestantPub[] contestant, int num)
	{
	}

}
