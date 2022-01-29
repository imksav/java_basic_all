// Design a class to represent a bank account. Include the following members:
//      Fields/Data members => done
//          Name of the depositor
//          Account number
//          Type of account
//          Balance amount in the account
//      Methods
//          Constructor(s) => done
//          To assign initial values => done
//          To deposit an amount => done
//          To withdraw an amount after checking balance => done
//          To display the name and balance => done

import java.util.Scanner;

public class BankAccount {
    String name, accountNumber, typeOfAccount;
    double balance;

    // constructor
    BankAccount(String name, String accountNumber, String typeOfAccount, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
    }

    // method to deposit
    double deposit(Scanner sc) {
        System.out.println("Enter the following credentials: ");
        System.out.print("Deposit Amount(in double): ");
        double amount = sc.nextDouble();
        this.balance = this.balance + amount;
        System.out.println("You have deposited " + amount + " in your account");
        System.out.println("Total Balance you have in your account: " + this.balance);
        return this.balance;
    }

    // method to withdraw
    double withdraw(Scanner sc) {
        System.out.println("Enter the following credentials: ");
        System.out.print("Withdraw Amount(in double): ");
        double withdraw = sc.nextDouble();
        if (withdraw > this.balance) {
            System.out.println("Sorry, you don't have enough balance to withdraw");
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("You have withdrawen " + withdraw + " from your account.");
        }
        System.out.println("Total Balance you have in your account: " + this.balance);
        return this.balance;
    }

    // method to display
    void display() {
        System.out.println("***********************Your Statement***********************");
        System.out.println("Account Holder's Name: " + this.name);
        System.out.println("Total Balance you have in your account: " + this.balance);
        System.out.println("Thank You for visiting us :) ");
    }

    public static void main(String[] args) {
        String name, accountNumber, typeOfAccount;
        double balance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following credentials: ");
        System.out.print("Account Holder's Name(in string): ");
        name = sc.next();
        System.out.print("Account Number(in string): ");
        accountNumber = sc.next();
        System.out.print("Account Type(in string): ");
        typeOfAccount = sc.next();
        System.out.print("Initial Balance(in double): ");
        balance = sc.nextDouble();

        // creatig objects
        BankAccount obj1 = new BankAccount(name, accountNumber, typeOfAccount, balance);
        obj1.deposit(sc);
        System.out.println("==========================================");
        obj1.withdraw(sc);
        System.out.println("==========================================");
        obj1.display();
    }
}