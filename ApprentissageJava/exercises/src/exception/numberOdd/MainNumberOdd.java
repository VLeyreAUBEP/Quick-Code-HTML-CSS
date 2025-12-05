package exception.numberOdd;

public class MainNumberOdd {
	public static void main(String[] args) {
		try {
			//NumberOdd nbOdd = new NumberOdd(17);
			NumberOdd nbEven = new NumberOdd(22);
			System.out.println(nbEven.getNumber() + " is even.");
		} catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
