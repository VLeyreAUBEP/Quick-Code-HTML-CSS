package inheritance.person;

public class MainEmployee {
	public static void main(String[] args) {
		Employee firstEmployee = new Employee("Gallo", "Lara", "GL485", "Enseignante", 6000);
		HRManager hr = new HRManager("Laporte", "René", "LR432", "HR", 8325);
		Employee newEmployee = hr.addEmployee("Leyre", "Victor", "LV406", "Apprenti", 800);
		
		firstEmployee.work();
		hr.work();
		newEmployee.work();
		newEmployee.getEmployeeId();
		newEmployee.getLastName();
		firstEmployee.getEmployeeId();
		firstEmployee.getLastName();
	}
}
