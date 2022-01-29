package assignment;

import java.util.Scanner;

/*Design a class to represent a bank account. Include the following members:
Fields/Data members:-
	Name of the depositor
	Account number
	Type of account
	Balance amount in the account
Methods:-
	Constructor(s)
	To assign initial values
	To deposit an amount
	To withdraw an amount after checking balance
	To display the name and balance
*/

public class BankAccount {
	String name;
	String accNum;
	String typeOfAcc;
	double balance;
	
	BankAccount(String name, String accNum, String typeOfAcc){
		this.name = name;
		this.accNum = accNum;
		this.typeOfAcc = typeOfAcc;
		this.balance = 0.0;
	}
	
	double deposit(double amount) {
		return this.balance = this.balance + amount;
		
	}
		
	double withdraw(double amount) {
		if(amount < this.balance) {
			this.balance = this.balance - amount;
			System.out.println("You have withdrawen " +amount+ " from your account");
			System.out.println("You have total " +this.balance+ " now");
			return this.balance;
		}
			System.out.println("Sorry! You don't have enough fund.");
			return this.balance;
	}
	
	void display() {
		System.out.println("Your account name is " +name);
		System.out.println("Your account number is " +accNum);
		System.out.println("You current balance is " +this.balance);
	}
	

	public static void main(String[] args) {
		String name;
		String accNum;
		String typeOfAcc;
		double addAmount;
		double subAmount;
		
		String condWithdraw;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount your Account Name: ");
		name = sc.nextLine();
		System.out.println("Enter the amount your Account Number: ");
		accNum = sc.nextLine();
		System.out.println("Enter the amount your Account Type: ");		
		typeOfAcc = sc.nextLine();
//		creating object
		BankAccount person1 = new BankAccount(name, accNum, typeOfAcc);
		System.out.println("Enter the amount you want to deposit: ");
		addAmount = sc.nextDouble();
		double deposited = person1.deposit(addAmount);
		System.out.println("You have deposited " +deposited+ " amount to your " +typeOfAcc+ "  account");
		
		
		sc.nextLine();
	
//		got error from here..................................
		
		System.out.println("Do you want to withdraw from your account(Y/N): ");
		condWithdraw = sc.nextLine();
		if(condWithdraw == "Y" || condWithdraw ==  "y") {
			System.out.println("Enter the amount you want to withdraw: ");
			subAmount = sc.nextDouble();
			double withdrawen = person1.withdraw(subAmount);
			System.out.println("You have withdrawen " +withdrawen+ " amount from your " +typeOfAcc+ "  account");
		}
		else {
			System.out.println("Your statement is: ");
			person1.display();
		}
	}
}
