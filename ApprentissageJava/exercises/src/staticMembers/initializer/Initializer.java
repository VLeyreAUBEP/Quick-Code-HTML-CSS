package staticMembers.initializer;

public class Initializer {
	private static int initialValue;
	
	static {
		initialValue = 1000;
		System.out.println("Static block: initialValue initialisée à " + initialValue);
	}
	
	public static int getInitialValue() {
		return initialValue;
	}
	
	public static void main(String[] args) {
		System.out.println("Valeur de initialValue avant son instantiation : " + Initializer.initialValue);
		
		//Initializer initializer = new Initializer();
		
		System.out.println("Valeur de initialValue après son instantiation : " + Initializer.initialValue);
		
	}
}
