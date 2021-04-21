package com.cg.beans;

import java.util.TreeMap;

public class SourceMap {
	private static TreeMap<String, String>data;
	public SourceMap() {
	//Initialize the TreeMap here..
		data = new TreeMap<>();
		data.put("ram", "0");
		data.put("sam", "1");
		data.put("tom", "2");
	}
	public String getNumber(String name) {
	//Return the number corresponding to the name else return null...
		if(data.containsKey(name))
			return data.get(name);
		
		return null;
	}
	public boolean getName(String number) {
	//Return true if number corresponding to the name in the TreeMap
		if(data.containsValue(number))
			return true;
		else 
			return false;
	}
	public String putNumber(String name, String number) throws Exception{
	//Add the (name, number) pair into TreeMap and return string "True"
	//Else throw an exception with the message "Name or Number:
		if(name==null || number==null)
			throw new Exception("Name and Number can not be null ");
		if(data.containsKey(name))
			throw new Exception("IllegalArgumentException");
		data.put(name, number);
		
		return "True";
	}
	

}
