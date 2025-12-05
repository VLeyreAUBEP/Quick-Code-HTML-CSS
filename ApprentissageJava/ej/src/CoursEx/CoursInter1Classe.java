package CoursEx;

public class CoursInter1Classe {
	public static void main(String[] args) {
		//Instance avec constructeur simple:
		/*
		Cours1Classe uneInstance = new Cours1Classe();
		uneInstance.afficherDescription();
		*/
		
		//1 Instance avec constructeur paramétré:
		Cours1Classe instance1 = new Cours1Classe("Ceci est la première instance.");
		instance1.afficherDescription();
		
		//2 Instance avec constructeur paramétré:
		Cours1Classe instance2 = new Cours1Classe("Ceci est la deuxième instance.");
		instance2.afficherDescription();
	}
}
