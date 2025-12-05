package nestedClass.mathUtil;

public class MathUtil {
	public static class Calculator {
		public static int add(final int a, final int b) {
			return a + b;
		}
	}
	
	public static void main(String[] args) {
		final int a = 32;
		final int b = 13;
		System.out.println("La somme entre " + a + " et " + b + " vaut : " + Calculator.add(a, b));
	}
}
