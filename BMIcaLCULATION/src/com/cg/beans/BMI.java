package com.cg.beans;

public class BMI {
	float height;
	float width;
	
	float bmi;
	
	public float returnHeight(String strheight) {
		String[] arr = strheight.split("@");
		arr[0]=arr[0].replace("-", ".");
		this.height=Float.parseFloat(arr[0]);
		
		return height;
		
	}
	
	public float returnWidth(String strwidth) {
		String[] arr = strwidth.split("@");
		arr[1]=arr[1].replace("-", ".");
		this.width=Float.parseFloat(arr[1]);
		
		return width;
		
	}
	
	public double calculateBmi(float h,float w) {
		if(h<=0 || w<=0)
			return -1;
		else
			return (w/h*h);
	}
	
	public String checkStatus(double bmi) {
		if(bmi>=20 && bmi<=24)
			return "nourshied";
			
		
		return "malnourished";
		
	}

}
