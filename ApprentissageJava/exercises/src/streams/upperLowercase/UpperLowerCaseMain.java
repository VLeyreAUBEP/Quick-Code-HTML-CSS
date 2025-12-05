package streams.upperLowercase;

import java.util.Arrays;

public class UpperLowerCaseMain {
	public static void main(String[] args) {
		UpperLowerCase liste1 = new UpperLowerCase(Arrays.asList("viCtoR", "DaVID", "matHieU", "chRIs", "roBin", "ALEX", "louIS"));
		System.out.println("La liste en minuscule : " + liste1.lowCase());
		System.out.println("La liste en majuscule : " + liste1.upCase());
	}
}
