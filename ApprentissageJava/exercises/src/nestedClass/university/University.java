package nestedClass.university;

public class University {
	public static class Department {
		private String name;
		private int nbMembers;
		
		public Department(final String name, final int nbMembers) {
			this.name = name;
			this.nbMembers = nbMembers;
		}
		
		public void displayInfo() {
			System.out.println("Nom du département : " + name);
			System.out.println("Nombre de membres : " + nbMembers);
		}
	}
	
	public static void main() {
		University.Department department = new University.Department("Computer science", 50);
		department.displayInfo();
	}
}
