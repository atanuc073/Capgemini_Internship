package com.cg.Demo;

public class Demo3 {
	public static void main(String[] args) {
		//user defined exception
		String result= checkEligible(16,200000);
		System.out.println(result);
		
	}
	public static String checkEligible(int age,double income) {
		try {
		processLoan(age,income);
		}catch(AgeException | IncomeException e) {
			return e.getMessage();
		}finally {
			System.out.println("I am in finally block");
		}
		return null;
	}
	
	
	public static String processLoan(int age,double income) {
		if(age<20 || age>45)
			throw new AgeException("Age must be bet 20 and 45");
		
		if(income<400000)
			throw new IncomeException("income must be minimum 4lakh");
		return "Loan eligible";
	}

}
