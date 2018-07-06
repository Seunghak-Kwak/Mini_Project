package com.javaya.controller;

import com.javaya.service.ICustomerService;

public class CustomerController {
	ICustomerService custService;
	
	public void setCustomerService(ICustomerService custService) {
		System.out.println("Customer controller - setCustomerSerive");
		this.custService = custService;
	}
	
	public void run(String name) {
		System.out.println("helloController :" + custService.run(name));
	}

}
