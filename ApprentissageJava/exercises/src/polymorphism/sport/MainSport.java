package polymorphism.sport;

public class MainSport {
	public static void main(String[] args) {
		Sport sport = new Sport();
		Sport football = new Football();
		Sport basketball = new Basketball();
		Sport rugby = new Rugby();
		
		sport.play();
		football.play();
		basketball.play();
		rugby.play();
	}
}
