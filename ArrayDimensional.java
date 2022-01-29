import java.util.Scanner;
class ArrayDimensional{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][]a = new int[2][2];
		int[][]b = new int[2][2];
		int[][]c = new int[2][2];

		System.out.println("Enter the elements of first 2X2 matrix:- ");
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				a[i][j] = input.nextInt();
			}
		}

		System.out.println("Enter the elements of second 2X2 matrix:- ");
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				b[i][j] = input.nextInt();
			}
		}

		System.out.println("Adding two matrix of 2X2");
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

				System.out.println("Result two matrix of 2X2:- ");
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				System.out.print(c[i][j] +" ");
			}
				System.out.println();
			}
		}
	}