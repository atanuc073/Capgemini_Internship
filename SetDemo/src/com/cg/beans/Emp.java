package com.cg.beans;

public class Emp  implements  Comparable<Emp>{
	private int empId;
	private String empName;
	private double empSal;
	
	public Emp(int empId,String empName , double empSal) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	@Override
	public String toString() {
		return empId+" "+empName+" "+empSal;
	}

	@Override
	public int compareTo(Emp emp) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.empId).compareTo(emp.empId);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
		//we want to eliminate duplicate based on empId
		// so in hashcode override we return empId.
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Emp emp= (Emp) obj;
		if(this==emp)
			return true;
		if(this.empId==emp.empId)
			return true;
		else
			return false;
					
	}
	
	

}
