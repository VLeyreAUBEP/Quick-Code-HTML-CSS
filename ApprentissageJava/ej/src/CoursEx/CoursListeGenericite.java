package CoursEx;

import java.lang.reflect.Array;

public class CoursListeGenericite<T> {
	private T[] liste;
	
	public CoursListeGenericite(Class<T> classe, int quantite) {
		this.liste = (T[]) Array.newInstance(classe, quantite);
	}
	
	public void add(int indice, int valeur) {
		this.liste[indice] = valeur;
	}
	
	public T get(int indice) {
		return this.liste[indice];
	}
}
