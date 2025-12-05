package nestedClass.greeting;

public class GreetingMain{
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello, World");
			}
		};
		
		greeting.sayHello();
	}
}
