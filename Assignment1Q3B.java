package myjava;

import java.util.Scanner;
public class Assignment1Q3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a size of elements:- ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []a = new int[size];
		
		System.out.println("Enter " +size+ " elements:- ");
			for(int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < size; i++) {
				for(int j = i + 1; j < size; j++) {
					if(a[i] > a[j]) {
						// swapping the value to find the largest number in array to compare with each other....
						int temp = a[i];
						a[i] = a[j];
						a[j] =	temp;				
					}
				}
			}
			// printing in ascending order.....
			System.out.println("The ascending order of the inserted elements are:- ");
			for(int i = 0; i < size; i++) {
				System.out.print(a[i]+ " ");
			}
		}
}