package inheritance.shape;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(final double length, final double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void area() {
		System.out.println("L'air d'un " + getClass().getSimpleName().toString() + " de longueur " + length + "cm et de largeur " + width + "cm vaut " + length*width + "cm.");
	}
}
