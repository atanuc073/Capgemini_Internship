package com.cg.clients;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.beans.Emp;
import com.cg.beans.EmployeeInfo;

public class EmpClient {
	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp("pram",30000));
		lst.add(new Emp("psam",40000));
		lst.add(new Emp("ptom",38000));
		lst.add(new Emp("pflen",45000));
		
		System.out.println("Enter the Method");
		Scanner scan = new Scanner(System.in);
		String method = scan.next();
		EmployeeInfo empinfo = new EmployeeInfo();
		List<Emp> emplst = empinfo.sortMethod(lst, method);
		display(emplst);
		
		System.out.println(empinfo.isCharecterPresentInAllNames(emplst, "p"));
		
	}

	private static void display(List<Emp> emplst) {

		for(Emp emp : emplst) {
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------------------");
		}
		
	}

}
