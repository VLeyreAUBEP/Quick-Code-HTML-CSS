package exception.numberOdd;

public class NumberOdd {
	private int number;
	
	public NumberOdd(final int number) {
		if(number % 2 == 0) {
			this.number = number;
		}else {
			throw new IllegalArgumentException(number + " is odd.");
		} 		
	}
	
	public int getNumber() {
		return number;
	}
}
