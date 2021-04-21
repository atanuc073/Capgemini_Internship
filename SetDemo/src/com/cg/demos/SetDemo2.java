package com.cg.demos;

import java.util.HashSet;
import java.util.Set;

import com.cg.beans.Emp;

public class SetDemo2 {
	public static void main(String[] args) {
		Emp e1=new Emp(1001,"ram",20000);
		Emp e2=new Emp(1003,"tom",50000);
		Emp e3=new Emp(1007,"sam",70000);
		Emp e4=new Emp(1002,"ajay",10000);
		Emp e5=new Emp(1004,"ajit",40000);
		Emp e6=new Emp(1001,"ram",20000);
//		Emp e7=new Emp(1001,"ram",20000);
		Emp e7=e2;
		Set<Emp> set =new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);   //ignored based on the content
		System.out.println(set.add(e7));  //ignored based on the reference.
		System.out.println(set.size());
		set.forEach(System.out :: println);
		
	
	
	}
}
