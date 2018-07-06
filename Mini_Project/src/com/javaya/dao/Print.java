package com.javaya.dao;
import com.javaya.model.Customer;

import java.util.ArrayList;

public class Print {

	public void printCustomerData(ArrayList<Customer> custList, int indexORcount) {
	      Customer cust = custList.get(indexORcount);
	      System.out.println("==========CUSTOMER INFO================");
	      System.out.println("이름 : " + cust.getName());
	      System.out.println("성별 : " + cust.getGender());
	      System.out.println("이메일 : " + cust.getEmail());
	      System.out.println("출생년도 : " + cust.getBirthYear());
	      System.out.println("=======================================");
	   }
	
   public void printAllCustomer(ArrayList<Customer> custList, int indexORcount) {
	      int i = 0;
	      while(i != indexORcount) {
	    	 Print printCustomer = new Print();
	         printCustomer.printCustomerData(custList, i);
	         i++;
	      }
	   }
		      	
}