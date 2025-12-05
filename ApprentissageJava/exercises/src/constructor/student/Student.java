package constructor.student;

public class Student {
	private int studentId;
	private String studentName;
	private double studentGrade;
	
	public Student() {
		this(0, "Unknown", 0.0);
	}
	
	public Student(final int studentId, final String studentName, final double grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGrade = grade;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public double getGrade() {
		return this.studentGrade;
	}
	
	public static void main(String[] args) {
		Student myStudent = new Student();
		
		System.out.println("ID de l'étudiant par défaut : " + myStudent.getStudentId());
		System.out.println("Nom de l'étudiant par défaut : " + myStudent.getStudentName());
		System.out.println("Note de l'étudiant par défaut : " + myStudent.getGrade());
	}
}
