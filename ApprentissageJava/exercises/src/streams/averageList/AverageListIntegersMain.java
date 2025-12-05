package streams.averageList;


import java.util.Arrays;

public class AverageListIntegersMain {
	public static void main(String[] args) {
		AverageListIntegers liste = new AverageListIntegers(Arrays.asList(1, 2, 5, 3, 6, 2, 4));
		System.out.println("The instanciation of the liste displays as " + liste.getListe());
		System.out.println("The average of the list is equal to " + String.format("%.2f", liste.getAverage()));
	}
}
