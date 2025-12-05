package polymorphism.shape;

public class MainShape {
	public static void main(String[] args) {
		Shape circle = new Circle(4.2);
		Shape rectangle = new Rectangle(2.4);
		Shape triangle = new Triangle(3.6, 2.5, 3.1, 2.12);
		
		String circleArea = String.format("%.2f", circle.calculateArea());
		String circlePerimeter = String.format("%.2f", circle.calculatePerimeter());
		System.out.println("L'aire du cercle vaut " + circleArea + " cm² et son périmètre vaut " + circlePerimeter + " cm.");
		System.out.println("L'aire du rectangle vaut " + rectangle.calculateArea() + " cm² et son périmètre vaut " + rectangle.calculatePerimeter() + " cm.");
		String triangleArea = String.format("%.2f", triangle.calculatePerimeter());
		System.out.println("L'aire du triangle vaut " + triangleArea + " cm² et son périmètre vaut " + triangle.calculatePerimeter() + " cm.");
	}
}
