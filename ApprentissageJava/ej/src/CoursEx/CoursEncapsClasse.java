package CoursEx;

//Encapsulation permet de protéger l'intégrité d'un objet.

public class CoursEncapsClasse {
	//Attribut déclaré en privé.
	private String description;
	
	//Si non-spécifié, une méthode/un constructeur est par défaut "public".
	public CoursEncapsClasse(final String description) {
		this.description = description;
	}
	
	public void afficherDescription() {
		System.out.println(this.description);
	}
	
	//getter pour atteindre l'attribut de la classe.
	public String getDescripiton() {
		return description;
	}
	
	//setter pour modifier la valeur de l'attribut de la classe.
	public void setDescription(String description) {
		this.description = description;
	}

}
