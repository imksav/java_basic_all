import java.util.Scanner;
class AllOperatorsFromUser{
	public static void main(String[] args) {
		
		/* one vado (mathi pahilai vako Scanner is purano vado) 
		ma naya bhado overlap garera rakhni ani teo naya ma vaarni */
		Scanner input = new Scanner(System.in);

		//prompt
		System.out.println("Enter a Number:- ");

		// naya vado ma euta arko sano temporary vaddo rakhera data halxa
		int num1 = input.nextInt();

		//prompt
		System.out.println("Enter another Number:- ");

		// naya vado ma euta arko sano temporary vaddo rakhera data halxa
		int num2 = input.nextInt();

		// main program starts
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int division = num1 / num2;
		int modulus = num1 % num2;

		// to display in the format of what you are going to do as it's value to be displayed
		System.out.println("The sum of " +num1+ " and " +num2+ " is " +sum+ ".");
		System.out.println("The difference of " +num1+ " and " +num2+ " is " +difference+ ".");
		System.out.println("The product of " +num1+ " and " +num2+ " is " +product+ ".");
		System.out.println("The division of " +num1+ " and " +num2+ " is " +division+ ".");
		System.out.println("The modulus of " +num1+ " and " +num2+ " is " +modulus+ ".");
	}
}