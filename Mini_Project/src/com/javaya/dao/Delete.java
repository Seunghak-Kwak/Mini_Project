package com.javaya.dao;
import java.util.ArrayList;
import com.javaya.model.Customer;

public class Delete {
	private ArrayList<Customer> custList;
	private int index;
	
	public Delete(ArrayList<Customer> custList, int index) {
		this.custList = custList;
		this.index = index;
	}
	   
	public ArrayList<Customer> deleteCustomerData() {
		custList.remove(index);
		return custList;
	}

}
