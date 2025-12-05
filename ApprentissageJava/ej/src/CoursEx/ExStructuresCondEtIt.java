package CoursEx;

public class ExStructuresCondEtIt {
	
	public static void main(String[] args) {
		final int[] tableEntier = {0, 4, 0, 1, 0, 0, 3, 2, 0};
		System.out.println(ExStructuresCondEtIt.compteZero(tableEntier));
		
	}
	
	public static int compteZero(final int[] tableEntier) {
		int compteurZero = 0;
		for(int entier : tableEntier) {
			if(entier == 0) ++compteurZero;
		}
		return compteurZero;
	}

}

