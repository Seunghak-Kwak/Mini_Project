import java.util.ArrayList;

public class Print {
	private ArrayList<Customer> custList;
	private int indexORcount;
	
	public Print(ArrayList<Customer> custList, int indexORcount) {
		this.custList = custList;
		this.indexORcount = indexORcount;	
	}
	
	public void printCustomerData() {
	      Customer cust = custList.get(indexORcount);
	      System.out.println("==========CUSTOMER INFO================");
	      System.out.println("이름 : " + cust.getName());
	      System.out.println("성별 : " + cust.getGender());
	      System.out.println("이메일 : " + cust.getEmail());
	      System.out.println("출생년도 : " + cust.getBirthYear());
	      System.out.println("=======================================");
	   }
	
   public void printAllCustomer() {
	      int i = 0;
	      while(i != indexORcount) {
	    	 Print printCustomer = new Print(custList,i);
	         printCustomer.printCustomerData();
	         i++;
	      }
	   }
		      	
}
