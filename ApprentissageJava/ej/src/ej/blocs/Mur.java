package ej.blocs;

import ej.exceptions.IllegalBlocException;

public class Mur extends Bloc {

	private boolean porteur;
	
	/**
	 * IllegalBlocException hérite de Exception
	 * @throws IllegalBlocException dans signature de la méthode
	 * Lorsque constructeur Mur est appelé dans main(), si il y a exception, celle-ci est directement renvoyée dans le main.
	 */
	public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur)
			throws IllegalBlocException {
		super(longueur, largeur, hauteur, Couleur.GRIS);
		this.porteur = porteur;
	}
	
	public void afficherBlock() {
		System.out.println(
				super.longueur + " " +
				super.largeur + " " +
				super.hauteur + " " +
				this.porteur);
	}
	
	public void afficherDescription(String description) {
		System.out.println(description);
	}
	
	public boolean estTraversable() {
		return !this.porteur;
	}
	
	
	/*@Override //Pas obligé mais bonne pratique
	public void afficherDescription() {
		this.afficherDescription("Je suis un mur !");
	}*/
}
