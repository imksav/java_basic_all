import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args) {
		System.out.println("Enter a number for Fibonacic:- ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int a = 0;
		int b = 1;
		int c;
		int i = 0;

		// This will print first two numbers
		System.out.print("The numbers are \t" + a +"\t"+ b + "\t");
		// here "num-2" means e have already printed 2 numbers above
		while(i<num-2){
			c = a + b;
			a = b;
			b = c;
			System.out.print(c+ "\t");
			i++;
		}
		
	}
}