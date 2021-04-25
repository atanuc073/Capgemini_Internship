package com.cg.beans;

public class StudentClient {
	
	
	public static void main(String[] args) {
		ScholarshipImpl sch = new ScholarshipImpl();
		System.out.println(sch.getStudentDetails("B"));
		System.out.println(sch.delete(1001));
		System.out.println(sch.getStudentDetails("A"));
	}

}
