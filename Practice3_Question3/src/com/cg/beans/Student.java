package com.cg.beans;

public class Student {
	private String studentName;
	private int studentId;
	private int studentScore;
	private String scholarshipScheme;
	
	public Student(String studentName,int studentId,int studentScore,String scholarshipScheme) {
		super();
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentScore=studentScore;
		this.scholarshipScheme=scholarshipScheme;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}

	public String getScholarshipScheme() {
		return scholarshipScheme;
	}

	public void setScholarshipScheme(String scholarshipScheme) {
		this.scholarshipScheme = scholarshipScheme;
	}
	
	@Override 
	public String toString() {
		return studentName+ " "+studentId+ " "+studentScore+" "+scholarshipScheme;
	}

}
