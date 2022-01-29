package myjava;

import java.util.Scanner;
public class DivisibleByOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number that is to be divided by other:-");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Enter a number that divide " +num+ " :-");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("The numbers that to be divided by other:- " +num);
		System.out.println("The numbers that will divide are:- " +num1+ " & " +num2+ ".");
			if(num % num1 == 0 && num % num2 == 0) {
				System.out.println("Divisible by " +num1+ " & " +num2+ ".");
			}
			else if(num % num1 == 0) {
				System.out.println("Divisible by " +num1+ ".");
			}
			else if(num % num2 == 0) {
				System.out.println("Divisible by " +num2+ ".");
			}
			else {
				System.out.println("Not divisible by " +num1+ " & " +num2+ ".");
			}
		
		
	}

}
