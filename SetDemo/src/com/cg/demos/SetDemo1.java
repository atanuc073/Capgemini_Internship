package com.cg.demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) {
		Set<String> set =new HashSet<>();
		System.out.println(set.add("ram"));
		set.add("tom");
		set.add("anand");
		set.add("shyam");
		set.add("ajit");
		System.out.println(set.add("tom"));
		set.forEach(System.out :: println);
		// HashSet does not maintain the order of elements
		//LinkedHashSet maintain the order of elements
		// TreeSet sorts the element
	}

}
