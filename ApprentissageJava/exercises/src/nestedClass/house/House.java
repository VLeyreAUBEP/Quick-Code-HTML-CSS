package nestedClass.house;

public class House {
	public void calculateArea() {
		class Room {
			public double getArea(final double length, final double width) {
				return length * width;
			}
		}
		Room room = new Room();
		final double length = 23.4;
		final double width = 3.6;
		System.out.println("L'air d'une pièce de longueur " + length + " et de largeur " + width + " vaut : " + room.getArea(length, width));
	}
	
	public static void main(String[] args) {
		House house = new House();
		house.calculateArea();
	}
}
