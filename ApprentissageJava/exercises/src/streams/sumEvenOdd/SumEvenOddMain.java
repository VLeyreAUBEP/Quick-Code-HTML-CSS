package streams.sumEvenOdd;

import java.util.Arrays;

public class SumEvenOddMain {
	public static void main(String[] args) {
		SumEvenOdd liste1 = new SumEvenOdd(Arrays.asList(2, 5, 8, 6, 10, 12, 15, 13, 3, 9));
		System.out.println("Voici la somme des entiers pairs de la liste : " + liste1.sumEven());
		System.out.println("Voici la somme des entiers impairs de la liste : " + liste1.sumOdd());
	}
}
