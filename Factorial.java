import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		System.out.println("Enter a number to find the Factorial of : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int fact = 1;
		int i = 1;

		for (i = 1; i<=num1 ; i++ ) {
			fact = fact * i;
		}
			System.out.println(fact); 
			
		}
	}