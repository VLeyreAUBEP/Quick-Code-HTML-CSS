package CoursEx;

import java.util.LinkedHashSet;
import java.util.Set;

public class CoursManipulerListesSet {
	
	public static void main(String[] args) {
		Set<String> motsCles = new LinkedHashSet<String>();
		motsCles.add("Cabane");
		motsCles.add("Cabane");
		motsCles.add("Muraille");
		
		for(String motCle : motsCles) {
			System.out.println(motCle);
		}
		
		if(motsCles.contains("Cabane")) {
			System.out.println("Le mot clé Cabane est présent !");
			motsCles.remove("Cabane");
		}
	}

}
