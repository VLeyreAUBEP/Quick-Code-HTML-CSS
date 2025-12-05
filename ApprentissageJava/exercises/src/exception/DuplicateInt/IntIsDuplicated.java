package exception.DuplicateInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IntIsDuplicated {
	private String statut;
	private Map<Integer, Boolean> mapNumber = new HashMap<Integer, Boolean>();
	
	public IntIsDuplicated() {
		int counter = 0;
		boolean exit = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Enter a positiv integer : ");
			try{
				verifyNumberDuplicate(reader);
				++counter;
			} catch(IOException e) {
				System.out.println("Error : " + e.getMessage());
			} catch(IntIsDuplicatedException e) {
				exit = false;
				System.out.println(e.getMessage());
			}
		} while(counter < 15);
		this.statut = exit ? "No duplication made : " : "Duplication made : ";
	}
	
	private void verifyNumberDuplicate(BufferedReader reader) throws IntIsDuplicatedException, IOException{
		try {
			String line = reader.readLine();
			int value = Integer.parseInt(line);
			System.out.println("You have entered the value : " + value);
			
			if(mapNumber.get(value) == null) {
				mapNumber.put(value, false);
			} else {
				mapNumber.put(value, true);
				throw new IntIsDuplicatedException("The value " + value + " has already been entered.");
			} 
		} catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	public void displayIntegers() {
		System.out.println(statut);
		for(Integer nb : mapNumber.keySet()) {
			String duplica = (mapNumber.get(nb) ? "Yes" : "No");
			System.out.println("Duplication of " + nb + " ? " + duplica);
		}
	}
}
