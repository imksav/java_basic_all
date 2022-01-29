package lab;

import java.util.Scanner;

public class Animal {
	String name;
	int numOfLeg;
	
	Animal(){
		this.numOfLeg = 4;
	}
	
	Animal(int a){
		this.numOfLeg = a;
	}
	
	void walk() {
		System.out.println("Walking");
	}
	
	void eat() {
		System.out.println("Eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Animal dog = new Animal();
		dog.name = "jack";
		dog.walk();
		Animal cat = new Animal();
		cat.name = "jimmy";
		cat.eat();
		Animal bat = new Animal();
		bat.name = "jimmy";
		bat.walk();
		System.out.println(dog.numOfLeg);
		System.out.println(bat.numOfLeg);
		
		
	}

}
