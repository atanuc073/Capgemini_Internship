package com.cg.demos;

import java.util.Comparator;

import com.cg.beans.Emp;

public class SalComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
//		Double sal1=emp1.getEmpSal();
//		Double sal2 =emp2.getEmpSal();
		int res = Double.valueOf(e1.getEmpSal()).compareTo((e2.getEmpSal()));
		if(res==0) 
			return Integer.valueOf(e1.getEmpId()).compareTo(e2.getEmpId());
		else
			return res;
		
	}

	

}
