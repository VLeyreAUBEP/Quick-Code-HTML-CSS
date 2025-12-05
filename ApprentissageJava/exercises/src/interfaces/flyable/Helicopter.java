package interfaces.flyable;

public class Helicopter implements Flyable {
	public void flyObj() {
		System.out.println("My " + getClass().getSimpleName().toLowerCase() + " is not flying.");
	}
}
