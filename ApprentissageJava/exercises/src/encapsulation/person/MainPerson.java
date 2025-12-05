package encapsulation.person;

public class MainPerson {
	public static void main(String[] args) {
		Person person= new Person("Victor", 28, "Switzerland");
		System.out.println("Une nouvelle personne a été instanciée avec pour nom : " + person.getName() + ", pour âge : " + person.getAge() + " ans et pour pays : " + person.getCountry());
	}
}
