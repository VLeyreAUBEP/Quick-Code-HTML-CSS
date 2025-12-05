package polymorphism.shape;

public class Triangle extends Shape{
	private double base;
	private double side1;
	private double side2;
	private double height;
	
	public Triangle(final double base, final double side1, final double side2, final double height) {
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	
	public double calculateArea() {
		return base * height / 2;
	}
	
	public double calculatePerimeter() {
		return side1 + side2 + base;
	}
}
