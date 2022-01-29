package assignment;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		System.out.println("How many number to enter?");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]a = new int[size];
		System.out.println(size);
		System.out.println("Please enter " +size+ " numbers:");
			for(int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("\n ");
			for(int i = 0; i < size; i++) {
				System.out.println(a[i]);
			}
			for(int i = 0; i < size; i++) {
				for(int j =0; j < size; j++) {
					if(a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("The sorted array values are: ");
				for(int i = 0; i < size; i++) {
					System.out.print(a[i]+" ");
				}


	}

}
