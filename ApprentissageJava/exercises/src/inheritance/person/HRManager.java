package inheritance.person;

public class HRManager extends Employee{
	public HRManager(final String name, final String surname, final String id, final String titleJob, final double salary) {
		super(name, surname, id, titleJob, salary);
	}
	
	public void work() {
		System.out.println("The new HR manager is called " + name + " and earns a salary of " + salary + "CHF.");
	}
	
	public Employee addEmployee(final String name, final String surname, final String id, final String titleJob, final double salary) {
		Employee employee = new Employee(name, surname, id, titleJob, salary);
		
		return employee;
	}
}
