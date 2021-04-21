package com.cg.Demo;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("line 1");
		System.out.println("Line 2");
		try {
		int res=9/0;
		System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("line 3");
		System.out.println("Line 4");
		
	}

}
