// Write a class Circle with a parameterized constructor.
// If no parameters are passed then its default constructor should be invoke parameterized constructor with default values.
// A circle is defined using radius and circumference.

import java.util.Scanner;

public class Circle {
    static double pi = 3.141592654;
    double radius;
    // default constructor
    Circle(){
        this.radius = 2;
    }
    // parameterized constructor
    Circle(double radius){
        this.radius = radius;
    }
    // method to calculate circumference
    public double calcCircumference(){
        double circumference = 2*(pi)*this.radius;
        return circumference;
    }
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        System.out.print("Radius: ");
        double r = sc.nextDouble();
        // creating objects
        Circle obj1 = new Circle(r);
        double circumference = obj1.calcCircumference();
        System.out.println("The circumference of a circle with radius " +r+ " is: " +circumference
        );
        // another object
        Circle obj2 = new Circle();
        circumference = obj2.calcCircumference();
        System.out.println("The circumference of a circle with default radius is: " +circumference
        );

    }

}