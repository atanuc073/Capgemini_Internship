package com.cg.client;

import java.util.TreeMap;

import com.cg.beans.SourceMap;

public class TestMapClient {
	public static void main(String[] args) throws Exception {

		
		
		SourceMap obj =new SourceMap();
		System.out.println(obj.getNumber("tom"));
		System.out.println(obj.getNumber("peter"));
		System.out.println(obj.getName("1"));
		System.out.println(obj.getName("5"));
		System.out.println(obj.putNumber("king", "3"));
		System.out.println(obj.putNumber("sam", "7"));
		
	}

}
