package com.javaya.model;

public class CustomerVIP extends Customer {
	private String job;
	private String address;
	private String income;
	
	public CustomerVIP(Customer cust,String job, String address ,String income) {
		super(cust.getName(),cust.getGender(),cust.getEmail(),cust.getBirthYear());
		this.job = job;
		this.address = address;
		this.income = income;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}
		
}