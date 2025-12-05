package CoursEx;

public class CoursFonctions {
	
	public static void main(String[] args) {
		int somme = CoursFonctions.addition(2, 7);
		System.out.println("Résultat de l'addition : " + somme);
		CoursFonctions.decompte(somme);
	}
	
	public static void affiche(String texte) {
		System.out.println(texte);
	}
	
	public static int addition(final int entier1, final int entier2) {
		return entier1 + entier2;
	}
	public static void decompte(final int valeur) {
		if(valeur >= 0) {
			System.out.println(valeur);
			decompte(valeur - 1);
		}
	}
}
