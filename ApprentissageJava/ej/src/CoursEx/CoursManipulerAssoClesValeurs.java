package CoursEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ej.*;
import ej.blocs.Bloc;
import ej.blocs.Mur;
import ej.blocs.Porte;

public class CoursManipulerAssoClesValeurs {
	public static void main(String[] args) {
		
		Map<Bloc, Integer> quantiteBloc = new HashMap<Bloc, Integer>();
		quantiteBloc.put(new Mur(1,1,1,true), 4);
		quantiteBloc.put(new Porte(1,1,1,false), 4);
		
		Set<Bloc> cles = quantiteBloc.keySet();
		for(Bloc cle : cles) {
			Integer valeur = quantiteBloc.get(cle);
			System.out.println(cle.getClass().getName() + " : " + valeur); 
		}
	}

}
