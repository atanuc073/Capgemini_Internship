package com.cg.client;

import com.cg.service.EmpService;

public class EmpClient {
	
	public static void main(String[] args) {
		EmpService ser = EmpService.getServiceInstace();
		ser.getEmployee();
		EmpService ser1 = EmpService.getServiceInstace();
		ser1.getEmployee();
		EmpService ser2 = EmpService.getServiceInstace();
		ser2.getEmployee();
		
	}

}
