package com.cg.demos;

import java.util.Set;
import java.util.TreeSet;

import com.cg.beans.Emp;

public class SetDemo4 {
	public static void main(String[] args) {
		
			Emp e1=new Emp(1001,"ram",70000);
			Emp e2=new Emp(1003,"tom",50000);
			Emp e3=new Emp(1007,"sam",70000);
			Emp e4=new Emp(1002,"ajay",10000);
			Emp e5=new Emp(1004,"ajit",70000);
			Set<Emp> set = new TreeSet<>( new SalComparator());
			// it eleminates based on salComparator
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
			set.add(e5);
			set.add(e3);
			set.forEach(System.out ::println);
			
	}

}
