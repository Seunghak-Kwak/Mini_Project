package com.javaya.dao;

import com.javaya.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class VIPenroll {
	static Scanner scan = new Scanner(System.in);
	
	public CustomerVIP register(ArrayList<Customer> custList, int index) {
		Customer cust = custList.get(index); //index
		System.out.println(cust.getName() + " 님의 ");
		System.out.print("직업 : ");
	    String job = scan.next();
		System.out.print("지역 : ");
	    String address = scan.next();
		System.out.print("수입 : ");
	    String income = scan.next();
	    
	    CustomerVIP IamVIP = new CustomerVIP(cust,job,address,income);
	    return IamVIP;
	}
	
	public void printVIPlist(ArrayList<CustomerVIP> vipcustList) {
		for (int i = 0; i < vipcustList.size(); i++) { //count
		  CustomerVIP vipcust = vipcustList.get(i);
	      System.out.println("======VIP CUSTOMER INFO================");
	      System.out.println("이름 : " + vipcust.getName());
	      System.out.println("성별 : " + vipcust.getGender());
	      System.out.println("이메일 : " + vipcust.getEmail());
	      System.out.println("출생년도 : " + vipcust.getBirthYear());
	      System.out.println("직업 : " + vipcust.getJob());
	      System.out.println("지역 : " + vipcust.getAddress());
	      System.out.println("수입 : " + vipcust.getIncome());
	      System.out.println("=======================================");
		}
	}

}