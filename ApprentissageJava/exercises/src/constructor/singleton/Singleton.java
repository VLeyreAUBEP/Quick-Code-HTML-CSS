package constructor.singleton;

public class Singleton {
	private static Singleton singleInstance = null;
	
	private Singleton() {
		System.out.println("Nouvelle instance créée.");
	}
	
	public static Singleton getSingleInstance() {
		if(singleInstance == null) {
			singleInstance = new Singleton();
		}
		
		return singleInstance;
	}
	
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getSingleInstance();
		Singleton instance2 = Singleton.getSingleInstance();
		
		if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
	}
}
