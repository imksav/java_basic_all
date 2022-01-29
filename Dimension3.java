// Add a new constructor to the Dimension class created in question 1 as
// Dimension(Dimension dim)
// This constructor creates a new Dimension object with identical dimensions as the old
// Dimension object. The old object is not changed.

import java.util.Scanner;

public class Dimension3 {
    private double length;
    private double width;
    private double height;
    private double side;

    // constructor
    Dimension3(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Dimension3(double side) {
        this.length = side;
        this.width = side;
        this.height = side;

    }

    Dimension3(Dimension3 dim) {
        this.length = dim.length;
        this.width = dim.width;
        this.height = dim.height;
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
        Dimension3 cuboid1 = new Dimension3(l, w, h);
        System.out.println("The volume of cuboid1 having length, width, height of " + l + ", " + w + ", " + h
                + " respectively is " + cuboid1.calcVolume());
        System.out.println("The area of cuboid1 having length, width, height of " + l + ", " + w + ", " + h
                + " respectively is " + cuboid1.calcArea());
        Dimension3 cube1 = new Dimension3(s);
        System.out.println("The volume of cube1 having side of " + s + " is " + cube1.calcVolume());
        System.out.println("The area of cube1 having side of " + s + " is " + cube1.calcArea());
        System.out.println("========================================================================================");
        Dimension3 cuboid2 = new Dimension3(cuboid1);
        System.out.println("The volume of cuboid2 having length, width, height of " + l + ", " + w + ", " + h
                + " respectively is " + cuboid2.calcVolume());
        System.out.println("The area of cuboid2 having length, width, height of " + l + ", " + w + ", " + h
                + " respectively is " + cuboid2.calcArea());
        Dimension3 cube2 = new Dimension3(cube1);
        System.out.println("The volume of cube2 having side of " + s + " is " + cube2.calcVolume());
        System.out.println("The area of cube2 having side of " + s + " is " + cube2.calcArea());
    }
}
