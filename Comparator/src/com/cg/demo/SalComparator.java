package com.cg.demo;

import java.util.Comparator;

import com.cg.beans.Emp;

public class SalComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
//		Double sal1=emp1.getEmpSal();
//		Double sal2 =emp2.getEmpSal();
		return Double.valueOf(e1.getEmpSal()).compareTo((e2.getEmpSal()));
	}

	

}
