package constructor.rectangle;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(final double length, final double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(final Rectangle rectangle) {
		this.length = rectangle.getLength();
		this.width = rectangle.getWidth();
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(2.3, 4.7);
		Rectangle copieRectangle = new Rectangle(myRectangle);
		
		System.out.println("Longueur du rectangle copié : " + copieRectangle.getLength());
		System.out.println("Largeur du rectange copié : " + copieRectangle.getWidth());
	}
}
