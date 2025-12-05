package polymorphism.shape;

public class Rectangle extends Shape{
	private double side;
	
	public Rectangle(final double side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}
	
	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}
}
