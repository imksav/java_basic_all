package myjava;

import java.util.Scanner;
public class Assignment1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a character to check either it is 'Vowel or 'Consonant:- ");
		Scanner sc = new Scanner(System.in);
		char character = sc.next(). charAt(0);
		
		char choice = character;
		switch(choice) {
		case 'A':
		System.out.println("The character is 'Vowel'.");
		break;
		case 'a':
			System.out.println("The character is 'Vowel'.");
			break;
			
		case 'E':
			System.out.println("The character is 'Vowel'.");
			break;
		case 'e':
			System.out.println("The character is 'Vowel'.");
			break;
			
		case 'I':
			System.out.println("The character is 'Vowel'.");
			break;
		case 'i':
			System.out.println("The character is 'Vowel'.");
			break;
			
		case 'O':
			System.out.println("The character is 'Vowel'.");
			break;
		case 'o':
			System.out.println("The character is 'Vowel'.");
			break;
			
		case 'U':
			System.out.println("The character is 'Vowel'.");
			break;
		case 'u':
			System.out.println("The character is 'Vowel'.");
			break;
			
		default:
			System.out.println("The character is 'Consonant'.");
		}
	}
}
