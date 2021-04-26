package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import com.cg.beans.Employee;
import com.cg.beans.EmployeeInfo;
import com.cg.beans.EmployeeInfo.SortMethod;


public class EmpClient {
	public static void main(String[] args) {
	List<Employee> lst=new ArrayList<>();
	lst.add(new Employee("Mickey", 100000));
	lst.add(new Employee("Timmy", 50000));
	lst.add(new Employee("Annny", 40000));
	EmployeeInfo obj=new EmployeeInfo();
	List<Employee> res=obj.sort(lst, SortMethod.BYNAME);
	System.out.println(res);
	List<Employee> res2=obj.sort(lst,SortMethod.BYSALARY);
	System.out.println(res2);
	System.out.println(obj.isCharacterPresentInAllNames(lst,"M"));
	
}
}
