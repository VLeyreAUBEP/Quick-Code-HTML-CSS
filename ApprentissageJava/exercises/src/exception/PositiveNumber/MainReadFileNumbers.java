package exception.PositiveNumber;

import java.io.FileNotFoundException;

public class MainReadFileNumbers {
	public static void main(String[] args) throws FileNotFoundException {
		ReadFileNumbers fileNb = new ReadFileNumbers();
		System.out.println("Chemin vers le fichier est : " + fileNb.getFileName());
	}
}
