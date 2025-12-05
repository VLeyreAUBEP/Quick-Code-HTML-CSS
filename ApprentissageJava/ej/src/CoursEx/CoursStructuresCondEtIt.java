package CoursEx;

import java.util.List;
import java.util.Arrays;

public class CoursStructuresCondEtIt {
	public static void main(String[] args) {
		CoursStructuresCondEtIt.commmenteLaMeteo("");
		
		System.out.println(CoursStructuresCondEtIt.categorieDeFilm("Star Wars"));
		System.out.println(CoursStructuresCondEtIt.categorieDeFilm("Blanche neige"));
		System.out.println(CoursStructuresCondEtIt.categorieDeFilm("Indiana Jones"));
		System.out.println(CoursStructuresCondEtIt.categorieDeFilm("La petite sirène"));
		System.out.println(CoursStructuresCondEtIt.categorieDeFilm("aaaaaaa"));
		
		//Initialisation d'une liste via un array
		List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript", "C#");
		for(String nomDUnLangage: nomsDesLangages) {
			String resultat = nomDUnLangage.toUpperCase();
			System.out.println(resultat);
		}
	}
	
	public static void chiffreEgalAZero(final int valeur) {
		if(valeur == 0) {
			System.out.println("L'entier passé en paramètre vaut 0.");
		} else {
			System.out.println("L'entier passé en paramètre est différent de 0.");
		}
	}
	
	public static void meteo(final boolean beauTemps) {
		if(beauTemps) {
			System.out.println("Je vais à la plage.");
		} else {
			System.out.println("Je vais au cinéma.");
		}
	}
	
	public static void meteoNegation(final boolean beauTemps) {
		if(!beauTemps) {
			System.out.println("Le temps n'est pas beau.");
		}
	}
	
	public static void meteoComparaison(final String temps) {
		//Egalité de chaîne de caractères se fait avec equals en Java et non ==
		if(temps.equals("soleil")) {
			System.out.println("Je vais à la plage");
		}
	}
	
	public static void commmenteLaMeteo(final String meteo) {
		switch(meteo) {
			case "soleil" -> System.out.println("Beau temps");
			case "nuage" -> System.out.println("Couvert");
			case "pluie" -> System.out.println("Mauvais temps");
			default -> System.out.println("Je ne sais pas.");
		}
	}
	
	public static String categorieDeFilm(final String film) {
		String resultat = switch(film) {
			case "Star Wars" -> "Science fiction";
			case "Blanche neige", "La petite sirène" -> "Disney";
			case "Indiana Jones" -> {
				String categorie = "Aventure";
				yield categorie;
			}
			default -> "Inconnu";
		};
		return resultat;
	}
}
