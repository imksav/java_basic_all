import java.util.Scanner;

// Implement a class called Dimension based on the following information:
// Constructors
//      Dimension(double length, double width, double height)
//      Dimension(double side)
// Methods
//      double volume() // length*width*height
//      double area() // 2*(length*width+width*height+height*length)
// Make all the instance variables private so that they can be accessed only by the methods defined within the class. Make the methods public.
// Test your program.

public class Dimension {
    private double length;
    private double width;
    private double height;
    private double side;

    // constructor
    Dimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Dimension(double side) {
        this.length = side;
        this.width = side;
        this.height = side;

    }

    // nethod to calculate volume
    public double calcVolume() {
        double volume = this.length * this.width * this.height;
        return volume;
    }

    // nethod to calculate area
    public double calcArea() {
        double area = 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
        return area;
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the folloing instances: ");
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Width: ");
        double w = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        System.out.print("Side: ");
        double s = sc.nextDouble();

        // creating object
        Dimension cuboid1 = new Dimension(l, w, h);
        System.out.println("The volume of cuboid having length, width, height of " +l+", " +w+", " +h+" respectively is " +cuboid1.calcVolume());
        System.out.println("The area of cuboid having length, width, height of " +l+", " +w+", " +h+" respectively is " +cuboid1.calcArea());
        Dimension cube1 = new Dimension(s);
        System.out.println("The volume of cube having side of " +s+" is " +cube1.calcVolume());
        System.out.println("The area of cube having side of " +s+" is " +cube1.calcArea());
    }
}