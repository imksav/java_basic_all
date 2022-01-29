package clz;
//WAJP to count number of object created
class Employee{
	String name;
	double salary;
	String address;	
	static String company_name = "sunway int'l college";
	static int count = 0;
	
Employee(String name, double salary, String address){
	this.name = name;
	this.salary = salary;
	this.address = address;
	count++;
}

public void display() {
	System.out.println("Name: " +(this.name));
	System.out.println("Salary: " +(this.salary));
	System.out.println("Address: " +(this.address));
	System.out.println("Company: " +(this.company_name));
	}
}
public class CheckStatic {
	public static void main(String[] args) {
		
		Employee e = new Employee("abc", 3400, "ktm");
		System.out.println("Employee Details: " +(Employee.company_name));
		e.display();
		
		Employee f = new Employee("xyz", 5600, "btl");
		f.display();
		System.out.println("====****==== Total number of object =====****==== " +(Employee.count));
	}
	
}
