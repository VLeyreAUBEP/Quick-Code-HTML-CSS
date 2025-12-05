package encapsulation.student;

import java.util.ArrayList;

public class Student {
	private String studentID;
	private String studentName;
	private ArrayList<Double> grades = new ArrayList<>();
	
	public Student(final String studentID, final String studentName, final ArrayList<Double> grades) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grades = grades;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public ArrayList<Double> getGrades() {
		return grades;
	}
	
	public void setStudentID(final String studentID) {
		this.studentID = studentID;
	}
	
	public void setStudentName(final String studentName) {
		this.studentName = studentName;
	}
	
	public void setGrades(final ArrayList<Double> grades) {
		this.grades = grades;
	}
	
	public void addGrade(final double grade) {
		grades.add(grade);
	}
}
