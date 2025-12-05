package constructor.cat;

public class Cat {
	private String name;
	private int age;
	public Cat() {
		this.name = "Unknown";
		this.age = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public static void main(String [] args) {
		Cat myCat = new Cat(); 
		
		System.out.println("Nom du chat : " + myCat.getName());
		System.out.println("Age du chat : " + myCat.getAge());
	}
}
