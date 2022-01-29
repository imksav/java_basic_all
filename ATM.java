package myjava;

import java.util.Scanner;

// making objects...............
public class ATM{
	String acc_name;
	long acc_number;
	double balance;
	
ATM(String acc_name, long acc_number, double balance){
	this.acc_name = acc_name;
	this.acc_number = acc_number;
	this.balance = balance;
}
void display() {
	System.out.println("Your account name is " +acc_name);
	System.out.println("Your account number is " +acc_number);
	System.out.println("Your available balance is " +this.balance);
}
double deposit(double deposit) {
	return (this.balance + deposit);
	
}
double withdraw(double withdraw) {
	if(this.balance < withdraw) {
		return (withdraw);
	
	}
	else {
	return (this.balance - withdraw);
	}
}


	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String acc_name = sc.nextLine();
		long acc_number = sc.nextLong();
		double balance = sc.nextDouble();
		double deposit = sc.nextDouble();
		double withdraw = sc.nextDouble();
		
		ATM function = new ATM(acc_name, acc_number, balance);
		function.display();
		function.deposit(deposit);
		function.display();
		function.withdraw(withdraw);
		function.display();
	}
}