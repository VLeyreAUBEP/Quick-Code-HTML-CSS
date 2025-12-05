package constructor.dog;

public class Dog {
	private String name;
	private String color;
	
	public Dog(final String name, final String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public static void main(String[] args) {
		Dog myDog = new Dog("Joris", "Beige");
		System.out.println("Nom de mon chien : " + myDog.getName());
		System.out.println("Couleur de mon chier : " + myDog.getColor());
	}

}
