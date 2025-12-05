package abstractClass.geometricShape;

public class MainGeometricShape {
	
	public static void main(String[] args) {
		Square square = new Square(5.7);
		Triangle triangle = new Triangle(3.2, 2.7, 1.5, 2.17);
		
		System.out.println("The area of the square is equal to " + square.area() + "cm and its perimeter is equal to " + square.perimeter() + "cm.");
		System.out.println("The area of the triangle is equal to " + triangle.area() + "cm and its perimeter is equal to " + triangle.perimeter() + "cm.");
	}
}
