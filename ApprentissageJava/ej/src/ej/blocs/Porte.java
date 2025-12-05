package ej.blocs;

import java.util.function.Predicate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.exceptions.IllegalBlocException;
import ej.exceptions.PorteVerrouilleException;

public class Porte extends Bloc {
	
	private static Logger logger = LogManager.getLogger(Porte.class);

	private boolean verrouille;
	
	/**
	 * IllegalBlocException hérite de Exception
	 * @throws IllegalBlocException dans signature de la méthode
	 * Lorsque constructeur Porte est appelé dans main(), si il y a exception, celle-ci est directement renvoyée dans le main.
	 */
	public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouille)
			throws IllegalBlocException {
		super(longueur, largeur, hauteur, Couleur.BLEU);
		this.verrouille = verrouille;
	}
	
	public boolean estVerrouille() {
		return this.verrouille;
	}
	
	/**
	 * PorteVerrouilleException hérite de Exception
	 * @throws PorteVerrouilleException dans signature de la méthode
	 * Lorsque verrouiller est appelé dans main(), si il y a exception, celle-ci est directement renvoyée dans le main.
	 * logger.error peut être utilisé car il est un niveau au dessus (et non en dessous) de INFO.
	 * INFO est spécifié comme niveau de log dans log4j2.properties pour toutes les classes dans ej.blocs
	 */
	public void verrouiller() throws PorteVerrouilleException {
		if(this.verrouille) {
			logger.error("La porte ne peut pas être verrouillée car c'est déjà le cas.");
			throw new PorteVerrouilleException();
		} else {
			this.verrouille = true;
		}
	}
	
	public void forcerSerrure(Predicate<String> fonction) {
		String cleSecrete = "#Secret123";
		if(this.verrouille) {
			//fonction test s'applique à une fonction anonyme respectant l'interface fonctionnelle Predicate
			if(fonction.test(cleSecrete)) {
				this.verrouille = false;
			}
		}
			
	}
}
