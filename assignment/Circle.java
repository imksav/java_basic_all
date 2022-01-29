package lab;

public class Circle {
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	Circle(){
		this.radius = 2;
	}
		
	
	public static void main(String[] args) {
		Circle cir1 = new Circle(4);
		Circle cir2 = new Circle();
		System.out.println(cir1.radius);
		System.out.println(cir2.radius);
		
	}

}
