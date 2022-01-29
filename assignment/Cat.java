package lab;

public class Cat extends Overriding {
	String Name;
	Cat(String numOfLegs, String N){
		super(numOfLegs);
		this.Name = N;
	}
	public void eat() {
		super.eat();
		System.out.println("Cat name is " +this.Name);
	}
	public static void main(String[] args) {
		Cat obj1 = new Cat("6", "Jimmy");
		obj1.eat();

	}

}
