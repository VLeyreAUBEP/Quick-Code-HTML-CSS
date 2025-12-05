package inheritance.vehicle;

public class MainVehicle {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		vehicle.drive();
		car.drive();
	}
}
