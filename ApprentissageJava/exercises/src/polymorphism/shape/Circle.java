package polymorphism.shape;

public class Circle extends Shape{
	private double rayon;
	
	public Circle(final double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double calculateArea() {
		return rayon * rayon * Math.PI;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * rayon;
	}
}
