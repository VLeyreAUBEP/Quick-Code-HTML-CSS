package streams.countStrings;

import java.util.List;

public class CountStrings {
	private List<String> liste;
	
	public CountStrings(final List<String> liste) {
		this.liste = liste;
	}
	
	public List<String> getListe() {
		return liste;
	}
	
	public long countSpecificChar(final char pattern) {
		return liste.stream().filter(chaine -> chaine.contains(String.valueOf(pattern))).count();
	}
	
	public long startWithSpecificChar(final char pattern) {
		return liste.stream().filter(chaine -> chaine.startsWith(String.valueOf(pattern))).count();
	}
}