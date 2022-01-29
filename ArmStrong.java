import java.util.Scanner;
class ArmStrong{
	public static void main(String[] args) {
		System.out.println("Enter a number to check either a number is ArmStrong or Not:- ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int count = 0, rem;
		int num = num1;
		double sum = 0;
		int original_number = num1;

		while(num1>0){
			num1 = num1/ 10;
			count++;
		}

		while(num>0){
			rem = num%10;
			num = num/10;
			sum = sum + Math.pow(rem, count);
		}

		if (original_number == sum) {
		System.out.println("The number " +original_number+ " is ArmStrong.");		
		}
		else{
		System.out.println("The number " +original_number+ " is not ArmStrong.");
	}
}
}