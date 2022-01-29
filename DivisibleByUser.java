import java.util.Scanner;
class DivisibleByUser{
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		// Display the message
		System.out.println("Enter a number to divide:- ");
		// Ask to input "num1" i.e. to divide by below "num2" and "num3"
		int num1 = input.nextInt();

		// Display the message
		System.out.println("Enter a number to divide by:- ");
		// Ask to input "num2" i.e. to divide "num1"
		int num2 = input.nextInt();

		// Display the message
		System.out.println("Enter a number to divide by:- ");
		// Ask to input num1 i.e. to divide "num1"
		int num3 = input.nextInt();

		// Display the message
		System.out.println("Q.N 1) Is " +num1+ " exactly divisible by " +num2+ " ?");
		System.out.println("Q.N 2) Is " +num1+ " exactly divisible by " +num3+ " ?");

		// Main program begins here
		// check for both at first
		if (num1 % num2 == 0 && num1 % num3 == 0) {
			System.out.println("True Answer for both question is below:\n\nThe " +num1+ " is exactly divisible by " +num2+ " and " +num3+ ".");
		}
		// check for "num2" at second
		else if (num1 % num2 == 0) {
			System.out.println("True Answer for both question is below:\n\nThe " +num1+ " is exactly divisible by " +num2+ ".");
		}
		// check for "num3" at second
		else if (num1 % num3 == 0) {
			System.out.println("True Answer for both question is below:\n\nThe " +num1+ " is exactly divisible by " +num3+ ".");
		}
		// check for both if not divisible by both or individual at last
		else{
			System.out.println("True Answer for both question is below:\n\nThe " +num1+ " is not exactly divisible by " +num2+ " and " +num3+ ".");
		}
	}
}