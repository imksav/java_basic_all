package myjava;

import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	declaration of array for 2X3 matrices i.e. A, B, (C as a result).....
		// [row][column]
		int a[][] = new int[2][3];	// Matrix A
		int b[][] = new int[3][2];	// Matrix B
		int c[][] = new int[2][2];	// Matrix C
		//	assigning the data to the matrices.....
		System.out.println("Enter the elements of 2X3 matrix A:- ");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 3; j++) {
					a[i][j] = sc.nextInt();
				}
				System.out.println();
			}
		System.out.println("Enter the elements of 3X2 matrix B:- ");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 2; j++) {
					b[i][j] = sc.nextInt();
				}
				System.out.println();
			}
		System.out.println("Result of multiplication of '2X3 matrix A' and '3X2 matrix B' is shown below which is the matrix of '2X2 matrix C':- ");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				c[i][j] = 0;
				for(int k = 0; k < 3; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
		
		
		
/*
* This just a comment no need to write....
* Only for understanding how it works.....

		for(int i = 0; i < 2; i++) {
			for(int j = 0; i < 2; j++) {
				// For place of 0,0.....
				c[0][0] = (a[0][0] * b[0][0]) + (a[0][1] * b[1][0]) + (a[0][2] * b[2][0]);
				//	for place of 0,1....
				c[0][1] = (a[0][0] * b[0][1]) + (a[0][1] * b[0][1]) + (a[0][2] * b[2][1]);
				//	For place of 1,0......
				c[1][0] = (a[1][0] * b[0][0]) + (a[1][1] * b[1][0]) + (a[1][2] * b[2][0]);
				//	For place of 1,1......
				c[1][1] = (a[1][0] * b[0][1]) + (a[1][1] * b[1][1]) + (a[1][2] * b[2][1]);
				
				//	Printing the result of Matrix C.......
	System.out.println("The result is:- ");
	System.out.println(c[0][0]+ " " +c[0][1]+ " ");
	System.out.println(c[1][0]+ " " +c[1][1]+ " ");
			}
		}
*/