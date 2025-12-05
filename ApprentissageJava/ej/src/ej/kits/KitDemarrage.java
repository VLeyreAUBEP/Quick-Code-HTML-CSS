package ej.kits;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.IBloc;
import ej.exceptions.IllegalBlocException;

public class KitDemarrage {

	private Logger logger = LogManager.getLogger(KitDemarrage.class);
	
//	Classe KitDemarrage utilise interface Ibloc pour instance des Sets de Ibloc et String
	private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
	private Set<String> motsCles = new LinkedHashSet<String>();
	
	public Set<IBloc> getBlocs() {
		return blocs;
	}
	
	public Set<String> getMotsCles() {
		return motsCles;
	}

	
	public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {
		this.blocs.addAll(blocs);

		motsCles.add("Cabane");
		motsCles.add("Muraille");
		motsCles.add("Maison");
	}

	public void afficherKit() {
		System.out.println("Nombre de blocs dans le kit : " + blocs.size());
		System.out.print("Liste des mots clés du kit : ");
		
		/**
		 * Cette ligne de code fait la même chose que la boucle for mis en commentaire en dessous
		 * forEach prend une fonction anonyme en paramètre qui respecte l'interface fonctionnelle Consumer
		 * Consumer prend un paramètre générique de type T et ne renvoie rien.
		 * Consumer est donc parfait pour l'affichage d'un paramètre par exemple ce qui est le cas ici.
		 */
		motsCles.forEach( (motCle) -> {System.out.print(motCle + " ");});
		
		/**
		 * ligne de code ci-dessus peut aussi s'écrire en deux temps en
		 * déclarant une variable de type Consumer (qui elle même prend un paramètre dans ce cas de type String)
		 */
		Consumer<String> fonctionAnonyme = (motCle) -> { System.out.print(motCle + " "); };
		
		motsCles.forEach ( fonctionAnonyme );
		
		/**
		 * But de l'utilisation lambda est de réduire la taille du code
		 * Pas vraiment le cas si on instancie à chaque fois la fonction lambda
		 * ou même juste qu'on l'explicite dans les appels de fonctions les prenant en argument (ici forEach)
		 * 
		 * Référence à des méthodes préexistantes au lieu des fonctions lambda:
		 * out: attribut static de la classe Système typé par la classe PrintStream
		 * PrintStream a la méthode print de signature public void print(String s);
		 * Les :: viennent faire la référence de la méthode print qui est donc passé en paramètre effectif de forEach
		 */
		this.motsCles.forEach(System.out::print);
		
		
//		for (String motCle : motsCles) {
//			System.out.print(motCle + " ");
//		}
		
	}
	
	public void sauvegarder() {
		//Instanciation de StringBuilder -> chaîne de caractères vides avec capa de 16
		StringBuilder builder = new StringBuilder();
		
		//Ajoute (append) une chaîne de carac littérale
		builder.append("Kit de démarrage\n");
		
		//Ajoute chaque motCle du Set motCles
//		for(String motCle : motsCles) {
//			builder.append(motCle + " ");
//		}
		
		//Ajoute chaque motCle du Set motCles dans build à l'aide d'une fonction lambda
		this.motsCles.forEach( (motCle) -> {
			builder.append(motCle + " ");
		});
		
		try {
			//FileWriter est un flux de sortie qui permet d'écrire des caractères dans le fichier "kit.txt"
			//BufferedWriter permet d'écrire du texte dans le flux fileWriter
			BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
			// toString(): transforme n'importe quel objet de Java en chaîne de caractères
			writer.write(builder.toString());
			writer.close();
			//Exception traitée si pas possible d'écrire dans un fichier
		}catch (IOException e) {
			logger.error("Impossible d'écrire dans le fichier");
		}
	}

}