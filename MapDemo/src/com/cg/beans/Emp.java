package com.cg.beans;


	public class Emp implements Comparable<Emp>{
		private int empId;
		private double sal;
		private String empname;
		public Emp(int empId,  String empname,double sal) {
			super();
			this.empId = empId;
			this.sal = sal;
			this.empname = empname;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return empId + " " + empname + " " + sal;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public double getSal() {
			return sal;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		@Override
		public int compareTo(Emp emp) {
			// TODO Auto-generated method stub
		
			return Integer.valueOf(this.empId).compareTo(emp.empId);
		}
		
	}
