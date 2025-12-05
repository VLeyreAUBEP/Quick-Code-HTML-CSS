package abstractClass.geometricShape;

public class Triangle extends GeometricShape{
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
	
	@Override
	public double area() {
		return base * height / 2.;
	}
	
	@Override
	public double perimeter() {
		return base + side1 + side2;
	}
}
