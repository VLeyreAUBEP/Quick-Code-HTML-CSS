package staticMembers.constants;

public class Constants {
	private static final double PI = 3.14159;
	
	public static double area(final double radius) {
		return radius * radius * PI;
	}
	
	public static void main(String[] args) {
		double r = 22.14;
		
		System.out.println("Aire du cercle de rayon r = " + r + " : " + area(r));
	}
}
