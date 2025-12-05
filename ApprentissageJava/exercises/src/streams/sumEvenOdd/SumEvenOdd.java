package streams.sumEvenOdd;

import java.util.List;

public class SumEvenOdd {
	List<Integer> liste;
	
	public SumEvenOdd(final List<Integer> liste) {
		this.liste = liste;
	}
	
	public int sumEven() {
		return liste.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
	}
	
	public int sumOdd() {
		return liste.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
	}
}
