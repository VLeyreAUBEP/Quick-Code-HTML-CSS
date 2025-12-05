package abstractClass.geometricShape;

public class Square extends GeometricShape{
	private double side;
	
	public Square(final double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side;
	}
	
	@Override
	public double perimeter() {
		return 4 * side;
	}
}
