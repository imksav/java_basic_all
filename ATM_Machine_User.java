import java.util.Scanner;

public class ATM_Machine_User{

	private static Scanner in; 
	// initial balance to 0 for everyone
	private static float balance = 0;
	private static int anotherTransaction;

	public static void main(String args[]){
		in = new Scanner(System.in);

		// call our transaction method here 
		transaction();
	}

	private static void transaction(){

		// here is where most of the work is
		int choice; 

		System.out.println("Please select an option"); 
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance");

		choice = in.nextInt();

		switch(choice){
			case 1:
				// option number 1 is withdrawing
				float amount; 
				System.out.println("Please enter amount to withdraw: "); 
				amount = in.nextFloat();
				if(amount > balance || amount == 0){
					System.out.println("You have insufficient funds.\n\n");

					// ask if they want another transaction 
					anotherTransaction();
				} 
				else {
					// they have some cash
					// update balance 
					balance = balance - amount; 
					System.out.println("You have withdrawn "+amount+".\n Your new balance is "+balance+".\n");
					anotherTransaction(); 
				}
			break; 

			case 2:
				// option number 2 is depositing 
				float deposit; 
				System.out.println("Please enter amount you would wish to deposit: "); 
				deposit = in.nextFloat();
				// update balance 
				balance = deposit + balance;
				System.out.println("You have deposited "+deposit+".\n Your new balance is "+balance+".\n");
				anotherTransaction();
			break; 

			case 3:
				// this option is to check balance 
				System.out.println("Your balance is "+balance+".\n");
				anotherTransaction(); 
			break;

			default:
				System.out.println("Invalid option.\n\n"); 
				anotherTransaction();
			break;
		}
	}

	// this is sub class within a main class where you are asked either you want some more transaction or not
	private static void anotherTransaction(){
		System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
		anotherTransaction = in.nextInt();
		if(anotherTransaction == 1){
			// call transaction method i.e. above one within main class
			transaction();
		} else if(anotherTransaction == 2){
			System.out.println("Thanks for choosing us. Good Bye!");
		} else {
			System.out.println("Invalid choice\n\n");
			anotherTransaction();
		}
	}
}