// Write a program to implement a Book class that stores the details of a book namely,
// bookcode, name of the book, name of the author(s) and price.
// The class has methods to display any of the details individually.

import java.util.Scanner;

public class Book {
	String bookCode;
	String bookName;
	String authorName;
	double price;

	// constructor
	Book(String bookCode, String bookName, String authorName, double price) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

	// method to display book code
	void displayBookCode() {
		System.out.println("Book code is " + this.bookCode);
	}

	// method to display book name
	void displayBookName() {
		System.out.println("Book name is " + this.bookName);
	}

	// method to display book author name
	void displayAuthorName() {
		System.out.println("Book author name is " + this.authorName);
	}

	// method to display book price
	void displayPrice() {
		System.out.println("Book price is " + this.price);
	}

	// main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the following credentials: ");
		System.out.print("Book Code(in string): ");
		String bookCode = sc.nextLine();
		System.out.print("Book Name(in string): ");
		String bookName = sc.nextLine();
		System.out.print("Book Author Name(in string): ");
		String authorName = sc.nextLine();
		System.out.print("Book Price(in string): ");
		double price = sc.nextDouble();
		System.out.println("==============================================");
		// creating objects
		Book type1 = new Book(bookCode, bookName, authorName, price);
		type1.displayBookCode();
		System.out.println("==============================================");
		type1.displayBookName();
		System.out.println("==============================================");
		type1.displayAuthorName();
		System.out.println("==============================================");
		type1.displayPrice();
		System.out.println("==============================================");

	}
}