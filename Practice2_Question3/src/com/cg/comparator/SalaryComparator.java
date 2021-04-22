package com.cg.comparator;

import java.util.Comparator;

import com.cg.beans.Emp;

public class SalaryComparator implements Comparator<Emp>{
	
	@Override
	public int compare(Emp e1,Emp e2) {
		return Double.valueOf(e1.getSalary()).compareTo((double) e2.getSalary());
	}

}
