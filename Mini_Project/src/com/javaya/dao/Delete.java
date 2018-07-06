package com.javaya.dao;
import java.util.ArrayList;
import com.javaya.model.Customer;

public class Delete {
	   
	public ArrayList<Customer> deleteCustomerData(ArrayList<Customer> custList, int index) {
		custList.remove(index);
		return custList;
	}

}
