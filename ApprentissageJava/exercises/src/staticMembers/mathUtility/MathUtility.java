package staticMembers.mathUtility;

public class MathUtility {
	
	public static int somme(final int integer1, final int integer2) {
		return integer1 + integer2;
	}
	
	public static void main(String[] args) {
		final int integ1 = 42;
		final int integ2 = 9;
		
		System.out.println("La somme des deux entiers " + integ1 + " et " + integ2 + " vaut : " + somme(integ1, integ2));
	}
}

