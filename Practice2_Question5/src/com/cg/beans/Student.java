package com.cg.beans;

public class Student {
	
	private String name;
	private String usn;
	private String college;
	private String cgpa;
	
	public Student(String name,String usn,String college,String cgpa) {
		super();
		this.name=name;
		this.usn=usn;
		this.college=college;
		this.cgpa=cgpa;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setUsn(String usn) {
		this.name=usn;
	}
	public String getUsn() {
		return usn;
	}
	
	public void setCollege(String college) {
		this.name=college;
	}
	public String getCollege() {
		return college;
	}
	
	public void setCgpa(String cgpa) {
		this.name=cgpa;
	}
	public String getCgpa() {
		return cgpa;
	}
	

}
