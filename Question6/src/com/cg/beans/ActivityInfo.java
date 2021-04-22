package com.cg.beans;

public class ActivityInfo {
	
	public String handleException(Activity a) {
		try {
		doOperation(a);
		}catch(NullPointerException ex) {
			return "Null values found";
		}catch(RuntimeException ex) {
			return ex.getMessage();
		}
		return "No Exception Found";
		
		
		
	}
	
	public String doOperation(Activity a) {
		if(a.str1==null || a.str2==null)
			throw new NullPointerException();
		switch(a.op) {
		case "+" :
			return a.str1+a.str2;
		case "-" :
			return a.str2;
		default:
			throw new RuntimeException(a.op + " Invalid Operator");
			
		}

	}

}
