package interfaces.flyable;

public class Spacecraft implements Flyable{
	public void flyObj() {
		System.out.println("My " + getClass().getSimpleName().toLowerCase() + " is flying!");
	}
}
