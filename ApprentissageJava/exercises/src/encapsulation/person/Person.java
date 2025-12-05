package encapsulation.person;

public class Person {
	private String name;
	private int age;
	private String country;
	
	public Person(final String name, final int age, final String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public void setAge(final int age) {
		this.age = age;
	}
	
	public void setCountry(final String country) {
		this.country = country;
	}
}
