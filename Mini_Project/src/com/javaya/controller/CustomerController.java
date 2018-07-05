package com.javaya.controller;

import com.javaya.service.ICustomerService;

public class CustomerController {
	ICustomerService custService;
	
	public void setCustomerService(ICustomerService custService) {
		this.custService = custService;
	}
	
	public void run(String name) {
		System.out.println("helloController :" + custService.run(name));
	}

}
