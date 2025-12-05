package constructor.classroom;

public class Classroom {
	private String className;
	private String[] students;
	
	public Classroom(final String className, String[] students) {
		this.className = className;
		this.students = students;
	}
	
	public void printClassroom() {
		System.out.println("Nom de la classe : " + className);
		int compteur = 0;
		for(String student : students) {
			++ compteur;
			System.out.println("Elève " + compteur + " : " + student);
		}
	}
	
	public static void main(String[] args) {
		
		String[] studentArray = {"François", "George", "Anastasia", "Amory", "Julie", "Lara", "Victor"};
		Classroom myClassroom = new Classroom("PRG1", studentArray);
		myClassroom.printClassroom();
	}
}
