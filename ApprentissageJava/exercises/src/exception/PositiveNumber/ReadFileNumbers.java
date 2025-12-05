package exception.PositiveNumber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileNumbers {
	private String fileName;
	
	public ReadFileNumbers() throws FileNotFoundException {
		fileName = "src/exception/PositiveNumber/listeNumber.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String ligne;
			while((ligne = reader.readLine()) != null) {
				
				String[] tokens = ligne.trim().split("\\s+"); // split sur un ou plusieurs espaces
				for (String token : tokens) {
					int value = Integer.parseInt(token);
					try {
						numberIsNegative(value);
					} catch (PositiveNumberException e) {
						System.out.println("Le nombre " + value + " est positif.");
					}
				}	
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	public String getFileName() {
		return fileName;
	}
	
	private void numberIsNegative(int number) throws PositiveNumberException {
		if(number > 0) {
			throw new PositiveNumberException();
		}else {
			System.out.println("Le nombre " + number + " est négatif.");
		}
	}
}
