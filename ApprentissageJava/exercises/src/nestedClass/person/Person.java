package nestedClass.person;

public class Person {
	public class Adresse{
		private String city;
		private String state;
		
		public Adresse(final String city, final String state) {
			this.city = city;
			this.state = state;
		}
		
		public String getCity() {
			return city;
		}
		
		public String getState() {
			return state;
		}
	}
	public static void main(String[] args) {
		Person pers = new Person();
		Person.Adresse adr = pers.new Adresse("Los-Angeles", "Californie");
		
		System.out.println("La ville choisie pour passer ses prochaines vacances est : " + adr.getCity() + " dans l'état de " + adr.getState());
	}
	
}
