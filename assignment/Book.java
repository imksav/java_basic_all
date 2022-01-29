package assignment;



/*
	 Write a program to implement a Book class that stores the details of a book namely,
	bookcode, name of the book, name of the author(s) and price. The class has methods to
	display any of the details individually.
*/
import java.util.Scanner;

public class Book {
	String bookCode;
	String bookName;
	String authorName;
	float price;
	
	Book(String bookCode, String bookName, String authorName, float price){
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

void displayBookCode() {
	System.out.println("Book code is " +this.bookCode);
}

void displayBookName() {
	System.out.println("Book name is " +this.bookName);
}

void displayAuthorName() {
	System.out.println("Book author name is " +this.authorName);
}

void displayPrice() {
	System.out.println("Book price is " +this.price);
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the book code: ");
	String bookCode = sc.nextLine();
	System.out.println("Enter the name of the book: ");
	String bookName = sc.nextLine();
	System.out.println("Enter the name of the book author: ");
	String authorName = sc.nextLine();
	System.out.println("Enter the price of the book: ");
	float price = sc.nextFloat();
	Book type1 = new Book(bookCode, bookName, authorName, price);
	type1.displayBookCode();
	type1.displayBookName();
	type1.displayAuthorName();
	type1.displayPrice();
	}
}

