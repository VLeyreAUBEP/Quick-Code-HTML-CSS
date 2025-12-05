package encapsulation.movie;

public class MainMovie {
	public static void main(String[] args) {
		Movie.Duration duration = new Movie.Duration(2, 4);
		Movie starWars = new Movie("Star-Wars : l'empire contre-attaque", "Irvin Kershner", duration);
		System.out.println(starWars.getMovieDetails());
		starWars.setDuration(new Movie.Duration(2, 12));
		System.out.println(starWars.getMovieDetails());
		duration.setMinute(8);
		System.out.println(starWars.getMovieDetails());
	}	
}
