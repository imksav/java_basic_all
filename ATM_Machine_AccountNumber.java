import java.util.Scanner;

public class ATM_Machine_AccountNumber{

	
    private static Scanner option;
	private static int checkaccount;
	private static float balance = 0; // initial balance to 0 for everyone
	private static int anotherTransaction;
	private static int askaccountnumber;

	public static void main(String args[]){
		option = new Scanner(System.in);
		Scanner accountnumber = new Scanner(System.in);
		System.out.println("Enter your account number");
		checkaccount = accountnumber.nextInt();
		if (checkaccount == 52525252){
		System.out.println("Account number matched.");
		// call our transaction method here 
		transaction();
		
}else{
        System.out.println("Account number doesnot match.");
        askaccountnumber();
            }
}

	private static void transaction(){
		// here is where most of the work is
		int choice; 
					System.out.println("Please select an option"); 
					System.out.println("1. Withdraw");
					System.out.println("2. Deposit");
					System.out.println("3. Balance");
		choice = option.nextInt();

		switch(choice){
			case 1:
				float amount; 
				System.out.println("Please enter amount to withdraw: "); 
				amount = option.nextFloat();
				if(amount > balance || amount == 0){
					System.out.println("You have insufficient funds.\n\n"); 
					anotherTransaction(); // ask if they want another transaction
				} else {
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
				deposit = option.nextFloat();
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

	private static void anotherTransaction(){
		System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
		anotherTransaction = option.nextInt();
		if(anotherTransaction == 1){
			transaction(); // call transaction method
		} else if(anotherTransaction == 2){
			System.out.println("Thank you for choosing our services. Have a nice day ahead.");
		} else {
			System.out.println("Invalid choice\n\n");
			anotherTransaction();
		}
	}
	
	private static void askaccountnumber(){
		System.out.println("Enter your account number\n\n");
		askaccountnumber = option.nextInt();
		if(askaccountnumber == 52525252){
		        System.out.println("Account number matched.");
			transaction(); // call transaction method
		} else{
        		System.out.println("Account number doesnot match.");
                askaccountnumber();
}
}
}