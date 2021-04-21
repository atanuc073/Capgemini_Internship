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
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return 0;
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
	

}
