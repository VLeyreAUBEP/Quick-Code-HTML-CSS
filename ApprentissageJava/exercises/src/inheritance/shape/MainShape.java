package inheritance.shape;

public class MainShape {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Rectangle rect = new Rectangle(21.5, 7.3);
		
		shape.area();
		rect.area();
	}
}
