package CoursEx;

public class Cours1Classe {
	
	//Déclaration d'un attribut.
	String description;
	
	//Pas de constructeur ? -> Constructeur par défaut.
	
	//Constructeur simple
	/*
	Cours1Classe() {
		this.description = "Ceci est un bloc du jeu Epicraft's Journey";
	}
	*/
	
	//Constructeur paramétré
	
	Cours1Classe(final String description) {
		this.description = description;
	}
	
	void afficherDescription() {
		//this permet de travailler sur un attribut de la classe dans la classe
		System.out.println(this.description);
	}

}
