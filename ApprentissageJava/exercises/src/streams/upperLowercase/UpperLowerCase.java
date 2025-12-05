package streams.upperLowercase;

import java.util.List;
import java.util.stream.Collectors;

public class UpperLowerCase {
	private List<String> liste;
	
	public UpperLowerCase(List<String> liste) {
		this.liste = liste;
	}
	
	public List<String> upCase(){
		return liste.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	
	public List<String> lowCase(){
		return liste.stream().map(String::toLowerCase).collect(Collectors.toList());
	}
	
}
