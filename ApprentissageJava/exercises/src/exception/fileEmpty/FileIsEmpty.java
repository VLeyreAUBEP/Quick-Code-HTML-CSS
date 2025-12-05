package exception.fileEmpty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIsEmpty {
	private String fileName;
	
	public FileIsEmpty(final String fileName){
		try {
			this.fileName = fileName;
			fileIsEmpty(fileName);
			System.out.println("Le fichier " + fileName + " a bien été construit.");
			
		} catch(FileIsEmptyException e) {
			System.out.println("Le fichier " + fileName + " est vide.");
		}
	}
	
	private void fileIsEmpty(final String fileName) throws FileIsEmptyException{
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String ligne = reader.readLine();
			if(ligne == null) {
				throw new FileIsEmptyException();
			} else {
				StringBuilder build = new StringBuilder();
				build.append(ligne);
				while((ligne = reader.readLine()) != null) {
					build.append(ligne);
				}
				System.out.println("Le fichier " + fileName + " contient le texte suivant : ");
				System.out.println(build.toString());
			}
		} catch(FileNotFoundException e) {
			System.out.println("Erreur " + e.getMessage());
		} catch(IOException e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	}
	
	public String getFileName() {
		return fileName;
	}
}
