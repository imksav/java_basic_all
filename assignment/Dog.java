package lab;

public class Dog extends Overriding {
	String Name;
	Dog(String numOfLegs, String N){
		super(numOfLegs);
		this.Name = N;
	}
	void run() {
		super.Nolegs = "5";
	}
	public void eat() {
		System.out.println(this.Name+ " eating");
	}
	

	public static void main(String[] args) {
		
Dog obj1 = new Dog("4", "Tommy");
obj1.eat();
//obj1.walk();
	}

}
