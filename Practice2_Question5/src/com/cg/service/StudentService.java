package com.cg.service;

import com.cg.beans.Student;

public class StudentService {
	
	public Student getStudent(String str) {
		// str="Amit Raj@1PC16c5046-ALU#8
		String[] arr = str.split("@");
		String name =arr[0];
		arr=arr[1].split("-");
		String usn =arr[0];
		arr=arr[1].split("#");
		String college=arr[0];
		String cgpa=arr[1];
		return new Student(name,usn,college,cgpa);
		
	}
	public String getStudent(Student s) {
		String usn = s.getUsn();
		String digit = usn.substring(usn.length()-3,usn.length());
		int dgt= Integer.parseInt(digit);
		if(dgt>=1 && dgt<=60)
			return "A";
		else if(dgt>=61 && dgt<=120)
			return "B";
		else if(dgt>=121 && dgt<=180)
			return "C";
		return "Z";
		
	}

}
