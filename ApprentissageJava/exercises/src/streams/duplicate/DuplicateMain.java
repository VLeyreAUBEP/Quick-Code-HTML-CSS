package streams.duplicate;

import java.util.Arrays;

public class DuplicateMain {
	public static void main(String[] args) {
		Duplicate liste1 = new Duplicate(Arrays.asList(2, 2, 5, 3, 4, 8, 8, 8, 10, 2, 10, 3, 12, 15));
		System.out.println("Etat de la liste avant d'enlever les occurences : " + liste1.getListe());
		System.out.println("Etat de la liste après avoir enlevé les occurences : " + liste1.removeDuplicate());
	}
}
