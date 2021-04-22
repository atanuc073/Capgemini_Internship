package com.cg.service;

// class contains only method not state then we can use Singleton.
// it avoid creating instances optimize memory.
// singleton can be applied it does not contain client data
public class EmpService {
//	public int empId;
//	public String empName;
	private static EmpService ser =new EmpService();
	
	
	private EmpService() {
		super();
		System.out.println("Emp service constructor");
	}
	// return the created instance
	public static EmpService getServiceInstace() {
		return ser;
	}
	public void getEmployee() {
		System.out.println("get Employee");
	}

}
