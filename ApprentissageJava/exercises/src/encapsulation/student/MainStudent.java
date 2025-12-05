package encapsulation.student;

import java.util.ArrayList;
import java.util.Arrays;

public class MainStudent {
	public static void main(String[] args) {
		ArrayList<Double> grades = new ArrayList<>(Arrays.asList(4.5, 2.8, 6., 5.7));
		Student student1 = new Student("VL987654", "Victor", grades);
		System.out.println("L'étudiant " + student1.getStudentName() + " a pour ID " + student1.getStudentID() + " et les notes suivantes " + student1.getGrades());
		double gradeMath = 6;
		System.out.println("On aimerait ajouter la note de mathématiques : " + gradeMath);
		student1.addGrade(gradeMath);
		System.out.println("Son tableau de notes correspond maintenant à " + student1.getGrades());
	}
}
