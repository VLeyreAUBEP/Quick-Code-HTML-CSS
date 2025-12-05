package exception.fileEmpty;

public class FileIsEmptyMain {
	public static void main(String[] args) {
		FileIsEmpty fichierRempli = new FileIsEmpty("src/exception/fileEmpty/fichierRempli.txt");
		FileIsEmpty fichierVide = new FileIsEmpty("src/exception/fileEmpty/fichierVide.txt");
		System.out.println("Premier fichier se trouve ici : " + fichierRempli.getFileName());
		System.out.println("Deuxième fichier se trouve ici : " + fichierVide.getFileName());
	}
}
