package ej;

//Librairies pour flux lecture entrée utilisateur
import java.io.BufferedReader;
//Exception pour entrée utilisateur non-trouvée
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//Multi-threading
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//ces librairies se trouvent dans les .jar dans referenced Librairies
//un fichier JAR est une archive regrouprant plusieurs fichiers Java compilés
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Librairies du projet
import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;
import ej.blocs.Type;
import ej.exceptions.IllegalBlocException;
import ej.kits.KitDemarrage;

public class Main {
//	Récupération instance de classe Logger selon la classe Main
	private static Logger logger = LogManager.getLogger(Main.class);	

	public static void main(String[] args) {

		logger.info("Lancement du programme Epicrafter's Journey.");
		long start = System.currentTimeMillis();
		try {
			// Le programme commence avec un Kit de démarrage.
			// Appelle de la méthode constructionSetBlocs() défini dans classe Main pour construire Set de blocs.
			KitDemarrage kit = new KitDemarrage(constructionSetBlocs());
			kit.sauvegarder();
			System.out.println("Vous possédez un kit de démarrage !");
			
			System.out.println("Que souhaitez-vous afficher ?\n\t1 - Les idées de constructions. \n\t2 - Le nombre de blocs pour chaque type de blocs pésent dans le kit.");
			
			/**InputStreamReader construit le flux d'octets provenant des entrées de l'utilisateur dans la console (System.in)
			  *BufferedReader construit le flux de caractère depuis le flux d'octets
			  *Le constructeur readLine() récupère le texte de la console passant dans le buffer du flux et le transforme en string
			 **/
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String reponse = reader.readLine();
			
			if(reponse.equals("1")) {
				
				// Il affiche les mots clés associés au Kit pour donner des idées à l'utilisateur.
				System.out.println("Voici quelques idées de constructions avec le Kit de démarrage : ");
				
				Set<String> motsCles = kit.getMotsCles();
				/************Boucle Standard***********************
				for(String mot : motsCles) {
					System.out.println(mot);
				}
				***************************************************/
				
				/*****forEach() avec ref function print************/
				motsCles.forEach(System.out::print);
				/**************************************************/
			} else if(reponse.equals("2")) {
				
				// Il affiche à l'utilisateur le nombre de blocs en fonction du type à contenu par le Kit.
				System.out.println("Voici le nombre de blocs de chaque type contenu dans le Kit de démarrage : ");
				
				//Type est un enum
				Map<Type, Integer> quantiteBloc = new TreeMap<Type, Integer>(); // La TreeMap permet de trier les entrées par ordre alphabétique de la clé.
				
				/************Boucle Standard***********************
				for (IBloc bloc : kit.getBlocs()) {
					
					//.getClass() vient chercher la classe de l'instance spécifique du bloc
					//.getSimpleName() vient récupérer le nom simple de la classe (ex. Mur) et le met en String
					//.toUpperCase() mets le String en MAJ
					Type type = Type.valueOf(bloc.getClass().getSimpleName().toUpperCase());
					
					//Compte et met à jour à chaque itération de boucle, le nombre de blocs spécifiques dans le kit
					int quantite = quantiteBloc.getOrDefault(type, 0) + 1; // Quantite existante + 1.
					
					//met à jour la map quantiteBloc
					quantiteBloc.put(type, quantite);
				}
				**************************************************/
				
				/**forEach() avec implémentation function lambda**/
				kit.getBlocs().forEach( (bloc) -> {
					Type type = Type.valueOf(bloc.getClass().getSimpleName().toUpperCase());
					
					int quantite = quantiteBloc.getOrDefault(type, 0) + 1;
					
					quantiteBloc.put(type, quantite);
				});
				/*************************************************/
				
				Set<Type> types = quantiteBloc.keySet();
				
				/************Boucle Standard***********************
				for(Type type : types) {
					System.out.println(type.toString() + " " + quantiteBloc.get(type));
				}
				***************************************************/
				
				/**forEach() avec implémentation function lambda**/
				types.forEach( (type) -> {
					System.out.println(type.toString() + " " + quantiteBloc.get(type));
				});
				/**************************************************/
				
			} else {
				System.out.println("La valeur saisie n'est pas valide - tapez 1 ou 2.");
			}
			
			/**
			 * Création de deux fonctions lamda qui vont tenter de forcer la serrure de porte
			 * Ces fonctions sont passées en paramètre de forcerSerrure
			 */
			Porte porte = new Porte(1, 1, 1, true);
			porte.forcerSerrure( (cle) -> {
				return cle.matches("[A-Za-z]{3}");
			});
			porte.forcerSerrure( (cle) -> {
				return cle.matches("#[A-Za-z]{6}123");
			});
			
		} catch (IllegalBlocException e) {
			System.out.println("Impossible de construire le Kit de démarrage.");
		} catch (IOException e) {
			logger.error("Impossible de récupérer la saisie utilisateur.");
		}
		
		logger.info("Arret du programme Epicrafter's Journey.");
		long end = System.currentTimeMillis();
		long executionTime = end - start;
		logger.info(executionTime + " milliseconds");
	}
	
	private static Set<IBloc> constructionSetBlocs() throws IllegalBlocException {
		Set<IBloc> blocs = new LinkedHashSet<IBloc>();
		
		/**
		 * Performance gérée ici avec la programmation concurrente -> par parallélisme.
		 * Il existe la programmation asynchrone qui gère aussi les problèmes de performance.
		 */
		
		
		/**************************************************Platform thread***********************************************/
		/**
		 *	
		 *	//Un platform thread est un pool thread géré par l'OS directement
		 *	
		 *
		 *	 
		 *	//Instance d'un executor de 10 platform threads
		 *	ExecutorService executorService = Executors.newFixedThreadPool(10);
		 *	
		 *	//Instanciations de taches pour construire des objets Murs/Portes/Toits
		 *	//Ces tâches retournent les objets et seront exécutée grâce au thread pool
		 *	//
		 *	Callable<IBloc> taskMur1 = () -> { return new Mur(3, 2, 2, true); };
		 *	Callable<IBloc> taskMur2 = () -> { return new Mur(2, 1, 2, false); };
		 *	Callable<IBloc> taskPorte = () -> { return new Porte(1, 2, 2, true); };
		 *	Callable<IBloc> taskToit = () -> { return new Toit(3, 1, 1); };
		 *	
		 *	List<Callable<IBloc>> tasks = Arrays.asList(taskMur1, taskMur1, taskMur2, taskMur2, taskPorte, taskToit
		 *			, taskToit, taskToit, taskToit);
		 *
		**/
		/****************************************************************************************************************/
		
		/******************************************************Virtual thread********************************************/
		
		/**
		 * Depuis Java21, introduction des virtuals threads.
		 * 
		 * Un virtual thread est géré par la JVM -> indépendant de l'OS et plus léger.
		 * 
		 * Virtual thread pas plus rapide à l'exécution qu'un Platform thread mais 
		 * créé et géré plus rapidement par la JVM (Pourquoi? Je ne sais pas).
		 * 
		 * Différence significative de performance après instanciation de 10000 blocs
		 * donc pas nécessairement utile dans le cadre de ce projet.
		 */
		
		//Instance d'un executor d'un virtual thread
		ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
		
		List<Callable<IBloc>> tasks = new ArrayList<Callable<IBloc>>();
		
		for(int i = 0; i < 10; i++) {
			Callable<IBloc> taskMur1 = () -> { return new Mur(3, 2, 2, true); };
			tasks.add(taskMur1);
		}
		
		/****************************************************************************************************************/
		
		try {
			//Future: type retour après exécution d'une tache qui renvoie un résultat dans un thread pool.
			List<Future<IBloc>> resultats = executorService.invokeAll(tasks);
			resultats.forEach(resultat -> {
				try {
					blocs.add(resultat.get());
				}catch(InterruptedException | ExecutionException e) {
					logger.error("Erreur durant la création du bloc.");
				}
			});
			
		} catch(InterruptedException e) {
			logger.error("Erreur durant la création de blocs.");
		}
		
		/**
		 * Section mis en commentaire car instancié au dessus avec des threads.
		 */
		// Le kit contient 4 blocs Mur.
		// Utilise polymorphisme pour ajouter instance de Mur dans un Set de type IBloc (interface) implémentée par Classe Bloc
//		blocs.add(new Mur(3, 2, 2, true));
//		blocs.add(new Mur(3, 2, 2, true));
//		blocs.add(new Mur(2, 1, 2, false));
//		blocs.add(new Mur(2, 1, 2, false));
//
//		// Le kit contient 1 bloc Porte.
//		blocs.add(new Porte(1, 2, 2, true));
//
//		// Le kit contient 4 blocs Toit.
//		blocs.add(new Toit(3, 1, 1));
//		blocs.add(new Toit(3, 1, 1));
//		blocs.add(new Toit(3, 1, 1));
//		blocs.add(new Toit(3, 1, 1));

		return blocs;
	}

}