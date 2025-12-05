package interfaces.flyable;

public class Airplane implements Flyable{
	public void flyObj() {
		System.out.println("My " + getClass().getSimpleName().toLowerCase() + " is flying.");
	}
}
