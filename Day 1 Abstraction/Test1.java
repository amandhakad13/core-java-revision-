abstract class Shape {
	
	abstract double area();
	
	void displayShapeName(String name) {
		System.out.println("Shape : "+name);
	}
}

class Circle extends Shape {
	
	double rad;

	Circle(double rad) {
		this.rad = rad;
	}
	
	double area() {
		return 3.14*rad*rad;
	}
}

class Rectangle extends Shape {
	
	double length;
	double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length*width;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Shape s1 = new Circle(5);
		s1.displayShapeName("Circle");
		System.out.println("Area of Circle : "+s1.area());
		
		Shape s2 = new Rectangle(10, 20);
		s2.displayShapeName("Rectangle");
		System.out.println("Area of Circle : "+s2.area());
		
	}
}