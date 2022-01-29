package lab;

public class Dimension {
	private double length,width, height;

	Dimension(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
}
	
Dimension(double side){
	this.length = side;
	this.width = side;
	this.height = side;
	}

public double getLength() {
	return this.length;
}

public void setLength(double a) {
	this.length = a;
}

private double faceArea() {
	return this.length*this.height;
}
private double sideArea() {
	return this.width*this.height;
}
private double topArea() {
	return this.width*this.length;
}

public double area() {
	double area;
	area = 2 * (faceArea()+sideArea()+topArea());
	return area;
}

//public double area() {
//	double area;
//	area = 2 * (this.length*this.width + this.width*this.height + this.length* this.height);
//	return area;
//}

public double volume() {
	double vol;
	vol = this.length*this.width*this.height;
	return vol;
	}


public static void main(String[] args) {
	Dimension cuboid = new Dimension(2,3,4);
	System.out.println("Volume of cuboid is "+cuboid.volume());
	System.out.println("Area of cuboid is "+cuboid.area());
	}
}
	
