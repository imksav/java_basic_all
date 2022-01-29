import java.util.Scanner;
class ArmStrongAll{
	public static void main(String[] args) {
		System.out.println("Enter a number to check either Armstrong or not: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int sum = 0;
		int power;
		int n = 0;
		int sum == user_num;
		while(n>0){
			num1 = num1 / 10;
			n++;
		}
		while(num1>0){
			int rem = num1 % 10; power = 1;
			for (i = 1; i <= n; i++) {
				power = power*rem;
				int sum = sum + cube;	
			}			
			 num1 = num1 / 10;
			}
		if (sum == user_num) {
			System.out.println("Armstrong");
			
		}else{
			System.out.println("Not Armstrong");

		}

	}
}