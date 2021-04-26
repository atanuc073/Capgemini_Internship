package com.cg.beans;

import java.util.Collection;
import java.util.List;

public class EmployeeInfo {
	public enum SortMethod{
		BYNAME,
		BYSALARY;
	}
public List<Employee> sort(List<Employee> emps,final SortMethod method)
{
	switch(method) {
	case BYNAME:
		emps.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		break;
	case BYSALARY:
		emps.sort((e1,e2)->Integer.valueOf(e1.getSalary()).compareTo(e2.getSalary()));
	}
	return emps;
}
public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
	long count=entities.stream().filter(e->e.getName().startsWith(character)).count();
	if(count>0)
		return true;
	return false;
}
}
