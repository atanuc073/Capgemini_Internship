package com.cg.beans;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.cg.comparator.NameComperator;
import com.cg.comparator.SalaryComparator;

enum SortMethod{BYNAME,BYSALARY}

public class EmployeeInfo {
	
	public List<Emp> sortMethod(List<Emp> emp, String sortmethod){
		SortMethod method = SortMethod.valueOf(sortmethod.toUpperCase());
		
		switch(method) {
		case BYNAME:
			emp.sort(new NameComperator());
			return emp;
		case BYSALARY:
			emp.sort(new SalaryComparator());
			return emp;
		default:
			return null;		
		}
	
	}
	
	public boolean isCharecterPresentInAllNames(List<Emp> emp , String str) {
//		Iterator i =emp.iterator();
//		while(i.hasNext()) {
//			if(!((Emp) i).getName().startsWith(str))
//				return false;
//		}
//		return true;
		return emp.stream().allMatch(e->e.getName().startsWith(str));
		
	}
	


}
