package interfaces.flyable;

public class MainFlyable {
	public static void main(String[] args) {
		Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};
		
		for(Flyable obj : flyingObjects) {
			obj.flyObj();
		}
	}
}
