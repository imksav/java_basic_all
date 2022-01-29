package myjava;

import java.util.Scanner;
public class Methods {
	
	//	addition...............
	static int add(int x, int y) {
		int sum = x+y;
		System.out.println("The sum of two number is " +sum);
		return sum;
	}
	//	subtraction............
	static int sub(int x, int y) {
		int difference = x-y;
		System.out.println("The difference of two number is " +difference);
		return difference;
	}
	//	multiplication............
	static int mul(int x, int y) {
		int multiplication = x*y;
		System.out.println("The product of two number is " +multiplication);
		return multiplication;
	}
	//	division...........
	static int div(int x, int y) {
		int division = x/y;
		System.out.println("The division of two number is " +division);
		return division;
	}
	//	modulus...........
	static int mod(int x, int y) {
		int modulus = x%y;
		System.out.println("The modulus of two number is " +modulus);
		return modulus;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to perform arthemetic calculations.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		mod(a, b);
		
	}

}
