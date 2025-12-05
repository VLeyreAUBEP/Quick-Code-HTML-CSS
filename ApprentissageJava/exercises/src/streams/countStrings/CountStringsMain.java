package streams.countStrings;

import java.util.Arrays;

public class CountStringsMain {
	public static void main(String[] args) {
		CountStrings liste1 = new CountStrings(Arrays.asList("Bonjour", "aujourd'hui", "école", "au revoir"));
		System.out.println("The instanciation of the liste corresponds to : " + liste1.getListe());
		System.out.println("Searching for how many words in the list countains the letter \"o\" : " + liste1.countSpecificChar('o'));
		System.out.println("Searching for how many words in the list countains the letter \"u\" : " + liste1.countSpecificChar('u'));
		System.out.println("Searching for how many words start with the letter \"a\" : " + liste1.startWithSpecificChar('a'));
		System.out.println("Searching for how many words start with the letter \"é\" : " + liste1.startWithSpecificChar('é'));
	}
}