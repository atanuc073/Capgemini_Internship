package com.cg.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ScholarshipImpl {
	static HashMap<Integer,Student> hm =new HashMap<>();
	
	static {
		
		hm.put(1001, new Student("Rahul",1001,96,"A"));
		hm.put(1002, new Student("Ram",1002,85,"B"));
		hm.put(1003, new Student("Sam",1003,76,"C"));
		hm.put(1004, new Student("Rohon",1004,98,"A"));
		hm.put(1005, new Student("Avik",1005,83,"B"));
		hm.put(1006, new Student("Flen",1006,77,"C"));
	}
	
	public static List<Student> getStudentDetails(String sc){
		return hm.values().stream().filter(s->s.getScholarshipScheme().contentEquals(sc)).collect(Collectors.toList());
	}
	
	public boolean delete(int id) {
		if(hm.containsKey(id)) {
			hm.remove(id);
			return true;
		}
		else
			return false;
	}

}
