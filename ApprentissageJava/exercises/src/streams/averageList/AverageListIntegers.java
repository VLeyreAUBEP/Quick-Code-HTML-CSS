package streams.averageList;


import java.util.List;

public class AverageListIntegers {
	private List<Integer> liste;
	
	public AverageListIntegers(final List<Integer> liste) {
		this.liste = liste;
	}
	
	public List<Integer> getListe() {
		return liste;
	}
	
	public double getAverage() {
		return liste.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
	}
}
