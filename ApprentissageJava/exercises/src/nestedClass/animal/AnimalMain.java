package nestedClass.animal;

public class AnimalMain {
	public static void main(String[] args) {
		class Provisoire extends Animal {
			@Override
			public void makeSound() {
				System.out.println("Meow");
			}
		}
		Provisoire prov = new Provisoire();
		prov.makeSound();
	}
}
