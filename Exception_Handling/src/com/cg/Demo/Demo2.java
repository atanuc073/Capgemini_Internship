package com.cg.Demo;

public class Demo2 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		if (b!=0) {
			int c=a/b;
			System.out.println(c);
		}
		int[] arr= {5,7,10};
		int idx=3;
		if (idx<arr.length) {
			System.out.println(arr[idx]);
		}
//		String str=null;
		display(null);
		show()
		
	}
	public static void display(String str) {
		if (str!=null) {
			System.out.println(str.toUpperCase());
		}

			
		}
	public static void show (Object obj) {
		if(str isinstance String) {
			String str=(String)obj;
			System.out.println(str.toUpperCase());
		}
	}

}
