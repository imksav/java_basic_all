import java.util.Scanner;
class ArmStrong3{
	public static void main(String[] args) {
		System.out.println("Enter a number to check either Armstrong or not: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int sum = 0;
		int user_num = num1;
		while(num1>0){
			int rem = num1 % 10;
			sum = sum + (rem*rem*rem);
			System.out.println(rem+ " is remainder.");
			 num1 = num1 / 10;
			System.out.println(num1+ " is quotient.");
		}
		if (sum == user_num) {
			System.out.println("Armstrong");
			
		}else{
			System.out.println("Not Armstrong");

		}

	}
}