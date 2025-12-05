package constructor.point;

public class Point {
	private int x;
	private int y;
	
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(final double x, final double y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	
	public void printPoint() {
		System.out.println("Point (x, y) = (" + x + ", " + y + ")");
	}
	
	public static void main(String[] args) {
		Point myPoint = new Point(4.3, 0.9);
		myPoint.printPoint();
	}
}
