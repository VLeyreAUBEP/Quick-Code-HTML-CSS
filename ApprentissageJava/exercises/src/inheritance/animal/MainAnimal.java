package inheritance.animal;

public class MainAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.makeSound();
		cat.makeSound();
		
		Cheetah cheetah = new Cheetah();
		cheetah.move();
	}
}
