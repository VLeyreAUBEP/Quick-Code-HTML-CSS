package encapsulation.movie;

public class Movie {
	public static class Duration {
		private int heure;
		private int minute;
		
		public Duration(final int heure, final int minute) {
			this.heure = heure;
			this.minute = minute;
		}
		
		public int getHeure() {
			return heure;
		}
		
		public int getMinute() {
			return minute;
		}
		
		public void setHeure(final int heure) {
			this.heure = heure;
		}
		
		public void setMinute(final int minute) {
			this.minute = minute;
		}
	}
	private String title;
	private String director;
	private Duration duration;
	
	public Movie(final String title, final String director, final Duration duration) {
		this.title = title;
		this.director = director;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public Duration getDuration() {
		return duration;
	}
	
	public void setTitle(final String title) {
		this.title = title;
	}
	
	public void setDirector(final String director) {
		this.director = director;
	}
	
	public void setDuration(final Duration duration) {
		this.duration.setHeure(duration.getHeure());
		this.duration.setMinute(duration.getMinute());
	}
	
	public String getMovieDetails() {
		StringBuilder movieDetails = new StringBuilder();
		movieDetails.append("Le film " + title);
		movieDetails.append(" a été produit par le directeur de film " + director);
		movieDetails.append(" et a une durée de " + (duration.getHeure() < 10 ? "0" + duration.getHeure() : duration.getHeure()) + ":" + (duration.getMinute() < 10 ? "0" + duration.getMinute() : duration.getMinute()));
		
		return movieDetails.toString();
	}
}