package CoursEx;

import java.util.ArrayList;
import java.util.List;

public class CoursManipulerListes {
	public static void main(String[] args) {
		List<Integer> quantiteBlocsUtilises = new ArrayList<Integer>();
		quantiteBlocsUtilises.add(1);
		quantiteBlocsUtilises.add(3);
		quantiteBlocsUtilises.add(1);
		
		quantiteBlocsUtilises.remove(Integer.valueOf(3));
		
		for(Integer quantite : quantiteBlocsUtilises) {
			System.out.println(quantite);
		}
	}
}
