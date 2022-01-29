package myjava;

import java.util.Scanner;
public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to be compared:- ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("The numbers to be compared are:- " +num1+ ", " +num2+ " & " +num3+ ".");
			if(num1 > num2 && num1 > num3) {
				System.out.println("The " +num1+ " is greater number.");
			}
			else if(num2 > num1 && num2 > num3) {
				System.out.println("The " +num2+ " is greater number.");
			}
			else{
				System.out.println("The " +num3+ " is greater number.");
			}
	}

}
