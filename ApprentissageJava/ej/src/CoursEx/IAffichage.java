package CoursEx;

/** Une functional interface n'a pas d'impact sur le comportement du code exécuté
 * Pour une fonction lambda (fonction anonyme non rattachée à une classe)
 * la functional interface vient tout de même lui imposer un type de retour et ses paramètres d'entrées
 */
@FunctionalInterface
public interface IAffichage {
	void afficher(String texte);
}
