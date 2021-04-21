package com.cg.client;

import com.cg.beans.BMI;

public class BMIclient {
	public static void main(String[] args) {
		String str = "67-7@65-2";
		BMI obj =new BMI();
		float height=obj.returnHeight(str);
		float width = obj.returnWidth(str);
		double bmi = obj.calculateBmi(height, width);
		
		String res = obj.checkStatus(bmi);
		System.out.println("Height " + height);
		System.out.println("Width "+ width);
		System.out.println("BMI "+ bmi);
		System.out.println(res);
		
	}

}
