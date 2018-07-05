package com.javaya.dao;

import com.javaya.model.Customer;

import java.util.ArrayList;
import java.util.Scanner;
public class Update {
	static Scanner scan = new Scanner(System.in);
	
	private ArrayList<Customer> custList;
	private int index;
	private String data;
	
	public Update(ArrayList<Customer> custList, int index) {
		this.custList = custList;
		this.index = index;
	}
	
   public void updateCustomerData() {
      Customer cust = custList.get(index);
      System.out.println("---------UPDATE CUSTOMER INFO----------");
      System.out.println("nothing change : just press Enter!!!!!!");
      System.out.print("이름(" + cust.getName() + ") :");
      data = scan.nextLine();
      if (updateORnot(data)) cust.setName(data);

      System.out.print("성별(" + cust.getGender() + ") :");
      data = scan.nextLine();
      if (updateORnot(data)) cust.setGender(data);
      
      System.out.print("이메일(" + cust.getEmail() + ") :");
      data = scan.nextLine();
      if (updateORnot(data)) cust.setEmail(data);

      System.out.print("출생년도(" + cust.getBirthYear() + ") :");
      data = scan.nextLine();
      if (updateORnot(data)) cust.setBirthYear(data);     
   }
   
   public boolean updateORnot(String data) {
	   boolean result = true;
	   if (data.equals("")) result = false;
	   
	   return result; 
   }
}