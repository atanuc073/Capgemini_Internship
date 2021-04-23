package com.cg.clients;

import com.cg.beans.Student;
import com.cg.service.StudentService;

public class StudentClient {
	
	public static void main(String[] args) {
		String parameters= "Amit Raj@1PC16C50136-ALU#8";
		
		StudentService stuser = new StudentService();
		Student stu1 = stuser.getStudent(parameters);
		String grade = stuser.getStudent(stu1);
		System.out.println(grade);
	}

}
