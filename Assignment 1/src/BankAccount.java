
//Alexander E Raschid
//EMPLID: 23628311

import java.io.*;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) throws IOException {
		// constant definitions
		final int MAX_NUM = 50;

		// variable declarations
		int[] acctNumArray = new int[MAX_NUM]; // array of account numbers
		double[] balanceArray = new double[MAX_NUM]; // array of balances
		int numAccts; // number of accounts
		char choice; // menu item selected
		boolean notDone = true; // loop control flag

		// open input test cases file
		File testFile = new File("/Users/MainUser/Desktop/cisc 3115 files/"
				+ "workspace/Assignment 1/src/myinput.txt");
		// File testFile = new File("mytestcases.txt");

		// create Scanner object
		// Input file scanner object for Account Database
		Scanner scFile = new Scanner(testFile);
		
		// Keyboard Scanner Object for input
		Scanner kybd = new Scanner(System.in); 

		// open the output file
		PrintWriter outFile = new PrintWriter(
				"/Users/MainUser/Desktop/cisc 3115 files/"
				+ "workspace/Assignment 1/src/myoutput.txt");
		// PrintWriter outFile = new PrintWriter("myoutput.txt");
		// PrintWriter outFile = new PrintWriter(System.out);

		/* first part */
		/* fill and print initial database */
		numAccts = readAccts(acctNumArray, balanceArray, MAX_NUM);
		printAccts(acctNumArray, balanceArray, numAccts, outFile);

		/* second part */
		/* prompts for a transaction and then */
		/* call functions to process the requested transaction */
		do {
			menu();
			choice = kybd.next().toLowerCase().charAt(0);
			switch (choice) {
			case 'q':
				notDone = false;
				printAccts(acctNumArray, balanceArray, numAccts, outFile);
				break;
			case 'b':
				balance(acctNumArray, balanceArray, numAccts, outFile, kybd);
				break;
			case 'd':
				deposit(acctNumArray, balanceArray, numAccts, outFile, kybd);
				break;
			case 'w':
				withdrawal(acctNumArray, balanceArray, numAccts,
						outFile, kybd);
				break;
			case 'n':
				numAccts = newAcct(acctNumArray, balanceArray, numAccts,
						outFile, kybd);
				break;
			case 'x':
				numAccts = deleteAcct(acctNumArray, balanceArray, numAccts,
						outFile, kybd);
				break;
			default:
				outFile.println("Error: " + choice + 
						" is an invalid selection -  try again");
				outFile.println();
				outFile.flush();
				break;
			}
			// give user a chance to look at output before printing menu
			// pause(kybd);
		} while (notDone);

		// close the output file
		outFile.close();

		// close the test cases input file
		kybd.close();

		System.out.println();
		System.out.println("The program is terminating");
	}

	/*
	 * Method readAccts() Input: acctNumArray - reference to array of
	 *  account
	 * numbers balanceArray - reference to array of account balances 
	 * maxAccts -
	 * maximum number of active accounts allowed Process: Reads the initial
	 *  database
	 * of accounts and balances Output: Fills in the initial account and
	 *  balance
	 * arrays and returns the number of active accounts
	 */
	public static int readAccts(int[] acctNumArray, double[] balanceArray, 
			int maxAccts) throws IOException {
		// open database input file
		// create File object
		File dbFile = new File("/Users/MainUser/Desktop/cisc 3115 files/"
				+ "workspace/Assignment 1/src/myinput.txt");
		// File dbFile = new File("myinput.txt");

		// create Scanner object
		Scanner sc = new Scanner(dbFile);

		int count = 0; // account number counter

		while (sc.hasNext() && count < maxAccts) {
			acctNumArray[count] = sc.nextInt();
			balanceArray[count] = sc.nextDouble();
			count++;
		}

		// close the input file
		sc.close();

		// return the account number count
		return count;
	}

	/*
	 * Method printAccts: Input: acctNumArray - array of account numbers
	 * balanceArray - array of account balances numAccts - number of active 
	 * accounts
	 * outFile - reference to the output file Process: Prints the database 
	 * of
	 * accounts and balances Output: Prints the database of accounts and 
	 * balances
	 */
	public static void printAccts(int[] acctNumArray, double[] balanceArray,
			int numAccts, PrintWriter outFile) {
		outFile.println();
		outFile.println("\t\tDatabase of Bank Accounts");
		outFile.println();
		outFile.println("Account   Balance");
		for (int index = 0; index < numAccts; index++) {
			outFile.printf("%7d  $%7.2f", acctNumArray[index], 
					balanceArray[index]);
			outFile.println();
		}
		outFile.println();

		// flush the output file
		outFile.flush();
	}

	/*
	 * Method menu() Input: none Process: Prints the menu of 
	 * 	transaction choices
	 * Output: Prints the menu of transaction choices
	 */
	public static void menu() {
		System.out.println();
		System.out.println("Select one of the following transactions:");
		System.out.println("\t****************************");
		System.out.println("\t    List of Choices         ");
		System.out.println("\t****************************");
		System.out.println("\t     W -- Withdrawal");
		System.out.println("\t     D -- Deposit");
		System.out.println("\t     N -- New Account");
		System.out.println("\t     B -- Balance Inquiry");
		System.out.println("\t     X -- Delete Account");
		System.out.println("\t     Q -- Quit");
		System.out.println();
		System.out.print("\tEnter your selection: ");
	}

	/*
	 * Method findAcct: Input: acctNumArray - array of account numbers
	 *  numAccts -
	 * number of active accounts requestedAccount - requested account
	 * requested_number Process: Performs a linear search on the acctNunArray
	 *  for
	 * the requested account Output: If found, the index of the requested 
	 * account is
	 * returned Otherwise, returns -1
	 */
	public static int findAcct(int[] acctNumArray, int numAccts, 
			int requestedAccount)
	{
		for (int index = 0; index < numAccts; index++)
			if (acctNumArray[index] == requestedAccount)
				return index;
		return -1;
	}

	/*
	 * Method balance: Input: acctNumArray - array of account numbers 
	 * balanceArray -
	 * array of account balances numAccts - number of active accounts 
	 * outFile -
	 * reference to output file kybd - reference to the "test cases" 
	 * input file
	 * Process: Prompts for the requested account Calls findAcct() to 
	 * see if the
	 * account exists If the account exists, the balance is printed 
	 * Otherwise, an
	 * error message is printed Output: If the account exists, the 
	 * balance is
	 * printed Otherwise, an error message is printed
	 */
	public static void balance(int[] acctNumArray, double[] balanceArray, 
			int numAccts, PrintWriter outFile, Scanner kybd) {
		int requestedAccount;
		int index;

		System.out.println();
		// prompt for account number
		System.out.print("Enter the account number: "); 
		requestedAccount = kybd.nextInt(); // read-in the account number

		// call findAcct to search if requestedAccount exists
		index = findAcct(acctNumArray, numAccts, requestedAccount);

		if (index == -1) // invalid account
		{
			outFile.println("Transaction Requested: Balance Inquiry");
			outFile.println("Error: Account number " + requestedAccount +
					" does not exist");
		} else // valid account
		{
			outFile.println("Transaction Requested: Balance Inquiry");
			outFile.println("Account Number: " + requestedAccount);
			outFile.printf("Current Balance: $%.2f", balanceArray[index]);
			outFile.println();
		}
		outFile.println();

		outFile.flush(); // flush the output buffer
	}

	/*
	 * Method deposit: Input: acctNumArray - array of account numbers
	 *  balanceArray -
	 * array of account balances numAccts - number of active accounts 
	 * outFile -
	 * reference to the output file kybd - reference to the "test cases" 
	 * input file
	 * Process: Prompts for the requested account Calls findacct() to see 
	 * if the
	 * account exists If the account exists, prompts for the amount to
	 *  deposit If
	 * the amount is valid, it makes the deposit and prints the new
	 *  balance
	 * Otherwise, an error message is printed Output: For a valid 
	 * deposit, the
	 * deposit transaction is printed Otherwise, an error message is printed
	 */
	public static void deposit(int[] acctNumArray, double[] balanceArray, 
			int numAccts, PrintWriter outFile, Scanner kybd) {
		int requestedAccount;
		int index;
		double amountToDeposit;

		System.out.println();
		System.out.print("Enter the account number: "); 
		requestedAccount = kybd.nextInt();

		// call findAcct to search if requestedAccount exists
		index = findAcct(acctNumArray, numAccts, requestedAccount);

		if (index == -1) // invalid account
		{
			outFile.println("Transaction Requested: Deposit");
			outFile.println("Error: Account number " + requestedAccount +
					" does not exist");
		} else // valid account
		{
			System.out.print("Enter amount to deposit: "); 
			amountToDeposit = kybd.nextDouble(); 

			if (amountToDeposit <= 0.00) {
				// invalid amount to deposit
				outFile.println("Transaction Requested: Deposit");
				outFile.println("Account Number: " + requestedAccount);
				outFile.println("Amount to Deposit: $" + amountToDeposit);
				outFile.printf("Error: $%.2f is an invalid amount", 
						amountToDeposit);
				outFile.println();
			} else {
				outFile.println("Transaction Requested: Deposit");
				outFile.println("Account Number: " + requestedAccount);
				outFile.printf("Old Balance: $%.2f", balanceArray[index]);
				outFile.println();
				outFile.println("Amount to Deposit: $" + amountToDeposit);
				balanceArray[index] += amountToDeposit; // make the deposit
				outFile.printf("New Balance: $%.2f", balanceArray[index]);
				outFile.println();
			}
		}
		outFile.println();

		outFile.flush(); // flush the output buffer
	}

	public static void withdrawal(int[] acctNumArray, double[] balanceArray, 
			int numAccts, PrintWriter outFile,Scanner kybd) {
		int requestedAccount;
		int index;
		double amountToWithdraw;

		System.out.println();
		System.out.print("Enter the account number: "); 
		requestedAccount = kybd.nextInt(); 

		// call findAcct to search if requestedAccount exists
		index = findAcct(acctNumArray, numAccts, requestedAccount);

		if (index == -1) // invalid account
		{
			outFile.println("Transaction Requested: Withdraw");
			outFile.println("Error: Account number " + requestedAccount
					+ " does not exist");
		} else // valid account
		{
			System.out.print("Enter amount to withdraw: "); 
			amountToWithdraw = kybd.nextDouble();

			// invalid amount to withdraw
			if (amountToWithdraw <= 0.00) 
			{
				outFile.println("Transaction Requested: Withdraw");
				outFile.println("Account Number: " + requestedAccount);
				outFile.println("Amount to Withdraw: $" + amountToWithdraw);
				outFile.printf("Error: $%.2f is an invalid amount", 
						amountToWithdraw);
				outFile.println();
				
				// Insufficient funds to withdraw
			} else if (amountToWithdraw > balanceArray[index]) 
			{
				outFile.println("Transaction Requested: Withdraw");
				outFile.println("Account Number: " + requestedAccount);
				outFile.println("Amount to Withdraw: $" + amountToWithdraw);
				outFile.println("Current Balance: " + balanceArray[index]);
				outFile.println("Error: Insufficient Funds -"
						+ " Transaction voided");
				outFile.println();
			} else {
				outFile.println("Transaction Requested: Withdraw");
				outFile.println("Account Number: " + requestedAccount);
				outFile.printf("Old Balance: $%.2f", balanceArray[index]);
				outFile.println();
				outFile.println("Amount to Withdraw: $" + amountToWithdraw);
				balanceArray[index] -= amountToWithdraw; // make the withdraw
				outFile.printf("New Balance: $%.2f", balanceArray[index]);
				outFile.println();
			}
		}
		outFile.println();

		outFile.flush(); // flush the output buffer

	}

	public static int newAcct(int[] acctNumArray, double[] balanceArray, 
			int numAccts, PrintWriter outFile, Scanner kybd) 
	{

		System.out.print("Enter a New Account Number:");
		int inputAcctNum = kybd.nextInt();

		// Checks if input is outside of appropriate acctNum values
		if (inputAcctNum < 100000 || inputAcctNum > 999999) {
			outFile.println("Transaction Requested: New Account");
			outFile.println("Error: Invalid Account Number Range");
			outFile.println("Account Numbers must be Integers "
					+ "of 6 digits within the range 100000 - 999999");
			outFile.println();
			outFile.flush();
			return numAccts;
		}
		
		// checks if there is space for a new acct
		int accountIndex = checkArrSpace(acctNumArray); 
		switch (accountIndex) {
		case -1: // No space found to add a new account
			outFile.println();
			outFile.println("Transaction Requested: New Account");
			outFile.println("Error: Max Accounts reached,"
					+ " please delete one to add another.");
			outFile.println();
			outFile.flush();
			return numAccts;
		default:
			switch (findAcct(acctNumArray, numAccts, inputAcctNum)) {
			// The inputAcctNum does not exist within the acctNumArray
			case -1: 
				acctNumArray[accountIndex] = inputAcctNum;
				balanceArray[accountIndex] = 0;
				numAccts++;

				outFile.println();
				outFile.println("Transaction Requested: New Account");
				outFile.printf("Account %d Created! \n", inputAcctNum);
				outFile.println();

				// Im purposefully printing an updated table of new accounts
				// after each new account
				printAccts(acctNumArray, balanceArray, numAccts, outFile);

				outFile.flush();

				return numAccts;
			default:
				outFile.println();
				outFile.println("Transaction Requested: New Account");
				outFile.printf("Error: Account Number %d already exists",
						inputAcctNum);
				outFile.println();
				outFile.flush();
				return numAccts;

			}
		}
	}

	public static int deleteAcct(int[] acctNumArray, double[] balanceArray,
			int numAccts, PrintWriter outFile,Scanner kybd) 
	{
		System.out.print("Enter an Account Number:");
		int inputAcctNum = kybd.nextInt();

		int accountIndex = findAcct(acctNumArray, numAccts, inputAcctNum);

		// If account doesn't exists
		if (accountIndex == -1) {
			outFile.println();
			outFile.println("Transaction Requested: Delete Account");
			outFile.printf("Error: Account Number %d does not exist",
							inputAcctNum);
			outFile.println();
			outFile.flush();
			return numAccts;
		} 
		else if (accountIndex != -1 && 
				//Account Exists w/ non-zero balance
		   balanceArray[accountIndex] != 0)
		{
			outFile.println();
			outFile.println("Transaction Requested: Delete Account");
			outFile.printf("Error: Account Number %d has a non-zero balance."
			+ " \n", inputAcctNum);
			outFile.println("Please withdraw the balance and try to delete"
					+ " again");
			outFile.println();
			outFile.flush();
			return numAccts;
		}

		acctNumArray[accountIndex] = 0;

		// Loop shifts all accounts / balances from right to left
		// to remove 0 int gap in array; Cleans it up
		for (int i = accountIndex; i < numAccts; i++) {
			acctNumArray[i] = acctNumArray[i + 1];
			balanceArray[i] = balanceArray[i + 1];
		}
		numAccts--;

		outFile.println();
		outFile.println("Transaction Requested: Delete Account");
		outFile.printf("Account Number %d has been deleted!", inputAcctNum);
		outFile.println();

		// Im purposefully printing an updated table of new accounts
		// after each deleted account
		printAccts(acctNumArray, balanceArray, numAccts, outFile);

		outFile.flush();

		return numAccts;
	}

	// Checks if there is space in the AcctNumArray to add an account
	// and if space exists checks
	// If space exists, return index of first positon available
	// else, returns -1
	public static int checkArrSpace(int[] acctNumArray) {
		for (int index = 0; index < acctNumArray.length; index++) {
			// System.out.println(acctNumArray[index]);
			if (acctNumArray[index] == 0)
				return index; // Returns first index of space in the array
		}
		return -1; // No space found
	}

	/* Method pause() */
	public static void pause(Scanner keyboard) {
		String tempstr;
		System.out.println();
		System.out.print("press ENTER to continue");
		tempstr = keyboard.nextLine(); // flush previous ENTER
		tempstr = keyboard.nextLine(); // wait for ENTER
	}

}