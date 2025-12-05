package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.exceptions.IllegalBlocException;

//La classe Bloc implémente l'interface IBloc
public abstract class Bloc implements IBloc {
	
//	Récupération instance de classe logger selon la classe Bloc
	private static Logger logger = LogManager.getLogger(Bloc.class);

	protected int longueur;
	protected int largeur;
	protected int hauteur;
	protected Couleur couleur;
	
	/**
	 * IllegalBlocException hérite de Exception
	 * @throws IllegalBlocException dans signature de la méthode
	 * Lorsque constructeur Bloc est appelé dans main(), si il y a exception, celle-ci est directement renvoyée dans le main.
	 * logger.error peut être utilisé car il est un niveau au dessus (et non en dessous) de INFO.
	 * INFO est spécifié comme niveau de log dans log4j2.properties pour toutes les classes dans ej.blocs
	 */
	public Bloc(final int longueur, final int largeur, final int hauteur, final Couleur couleur) throws IllegalBlocException {
		if (longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTEUR) {
			logger.error("Les valeurs minimales pour longueur, largeur et hauteur n'ont pas été respectées.");
			throw new IllegalBlocException();
		}
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.couleur = couleur;
		
		/**
		 * Simulation d'un problème de performance
		 */
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.error("Problème lors de la construction du bloc");
		}
		
		logger.info("Un bloc de type " + this.getClass().getSimpleName() + " a été construit.");
	}
	
	public int getLongueur() {
		return this.longueur;
	}
	
	public int getLargeur() {
		return this.largeur;
	}
	
	public int getHauteur() {
		return this.hauteur;
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(final Couleur couleur) {
		this.couleur = couleur;
	}

}
