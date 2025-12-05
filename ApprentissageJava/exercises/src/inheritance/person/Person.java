package inheritance.person;

public class Person {
	protected String name;
	protected String surname;
	
	public Person(final String name, final String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public void getFirstName() {
		System.out.println("Name of the person is " + name + ".");
	}
	
	public void getLastName() {
		System.out.println("Surname of the person is " + surname + ".");
	}
}
