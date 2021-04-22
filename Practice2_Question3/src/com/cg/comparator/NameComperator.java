package com.cg.comparator;

import java.util.Comparator;

import com.cg.beans.Emp;

public class NameComperator implements Comparator<Emp>{
	
	
	@Override
	public int compare(Emp e1,Emp e2) {
		
		
		return e1.getName().compareTo(e2.getName());
		
	}

}
