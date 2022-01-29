// Modify the implementation of area() given in the previous question using private
// methods, faceArea(), topArea() and sideArea().
// [Often private methods are helping methods that public methods use, but are not to be used outside the class.]
// Test your program.

import java.util.Scanner;

public class Dimension2 {
    private double length;
    private double width;
    private double height;
    private double side;

    // constructor
    Dimension2(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Dimension2(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // nethod to calculate volume
    public double calcVolume() {
        double volume = this.length * this.width * this.height;
        return volume;
    }

    // method to calculate face area
    private double faceArea() {
        double faceArea = this.width * this.height;
        return faceArea;
    }

    // method to calculate top area
    private double topArea() {
        double topArea = this.length * this.width;
        return topArea;
    }

    // method to calculate side area
    private double sideArea() {
        double sideArea = this.length * this.height;
        return sideArea;
    }

    // nethod to calculate area
    public double calcArea() {
        double area = 2 * (faceArea() + topArea() + sideArea());
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
        Dimension2 cuboid1 = new Dimension2(l, w, h);
        System.out.println("The volume of cuboid having length, width, height of " + l + ", " + w + ", " + h
                + " respectively is " + cuboid1.calcVolume());
        System.out.println("The area of cuboid having length, width, height of " + l + ", " + w + ", " + h
                + " respectively is " + cuboid1.calcArea());
        Dimension2 cube1 = new Dimension2(s);
        System.out.println("The volume of cube having side of " + s + " is " + cube1.calcVolume());
        System.out.println("The area of cube having side of " + s + " is " + cube1.calcArea());
    }
}