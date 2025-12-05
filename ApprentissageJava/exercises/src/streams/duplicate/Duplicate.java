package streams.duplicate;

import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
	private List<Integer> liste;
	
	public Duplicate(final List<Integer> liste) {
		this.liste = liste;
	}
	
	public List<Integer> getListe() {
		return liste;
	}
	
	public List<Integer> removeDuplicate(){
		return liste.stream().distinct().collect(Collectors.toList());
	}
}
