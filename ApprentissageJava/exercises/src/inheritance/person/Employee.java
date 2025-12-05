package inheritance.person;

public class Employee extends Person {
	protected String id;
	protected String titleJob;
	protected double salary;
	
	public Employee(final String name, final String surname, final String id, final String titleJob, final double salary) {
		super(name, surname);
		this.id = id;
		this.titleJob = titleJob;
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("The new employee's name is " + name + " and earns a salary of " + salary + "CHF.");
	}
	public double getSalary() {
		return salary;
	}
	
	public void getEmployeeId() {
		System.out.println("The id of " + surname + " " + name + " is : " + id + ".");
	}
	public void getLastName() {
		System.out.println("Surname of the person is " + surname + " and his job is " + titleJob + ".");
	}
	
}
