import java.util.Scanner;
class Divisible_By{
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);

		// Display the message as below
		System.out.println("Enter a Number either exactly divisible by 5 or 6:- ");
		int num = input.nextInt();

		// Main program begins here
		// check for both at first
		if (num % 5 == 0 && num % 6 == 0) {
			System.out.println("The " +num+ " is exactly divisible by 5 and 6.");
		}
		// check for 6 at second
		else if (num % 6 == 0) {
			System.out.println("The " +num+ " is exactly divisible by 6.");
		}
		// check for 5 at third
		else if (num % 5 == 0) {
			System.out.println("The " +num+ " is exactly divisible by 5.");
		}
		// check for both if not divisible by both or individual at last
		else{
			System.out.println("The " +num+ " is not exactly divisible by 5 and 6.");
		}
	}
}