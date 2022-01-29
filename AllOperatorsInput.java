 

//Program that input two numbers then displays their sum
//program uses class Scanner
import java.util.Scanner;

public class AllOperatorsInput {

	//Main method begins execution of Java Application
	public static void main(String[] args) {
		//Create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//prompt
		System.out.println("Enter first number:- ");
		
		//read first number from user
		int num1 = input.nextInt();
		//prompt
		System.out.println("Enter second number:- ");
		
		//read second number from user
		int num2 = input.nextInt();
		
		//add numbers, then store total in sum
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int divide = num1 / num2;
		int modulus = num1 % num2;
		//Display Sum, Difference, Product, Divide, Modulus 
		System.out.println("Sum is " +sum);
		System.out.println("Difference is " +difference);
		System.out.printf("Product is %s%n", product);
		System.out.println("Divide is " +divide);
		System.out.printf("Modulus is %s%n", modulus);
		
	}
}
