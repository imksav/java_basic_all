package myjava;

import java.util.Scanner;
public class CheckOddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e_c = 0;
		int o_c = 0;
		System.out.println("Enter the size of array:- ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter the numbers from 0 to " +size+ " :- ");
		for(int i = 0; i < size; i++) {
			a[i] = i+1;
			System.out.println("The number in the array a["+i+"] = " +a[i]+ ".");
		}
		for(int i = 0; i < size; i++) {
			if(a[i] % 2 == 0) {
				System.out.println("The number in the array a["+i+"] = " +a[i]+ " is Even.");
				e_c++;
			}
			else {
				System.out.println("The number in the array a["+i+"] = " +a[i]+ " is Odd.");
				o_c++;
			}
		}
		System.out.println("Total number of Even number in the array is " +e_c+".");
		System.out.println("Total number of Odd number in the array is " +o_c+".");
	}
}