import com.javaya.controller.CustomerController;
import com.javaya.service.*;

public class CustomerMain {

	public static void main(String[] args) {
		//Abstrcatsdsds context = new Generiadssdsda("applicasd-confad.xml");
		//CustomerController custController = (CustomerController )new CustomerController();
		
		ICustomerService custService = new CustomerService();
		CustomerController custController = new CustomerController();
		
		System.out.println("Main");
		
		
		custController.setCustomerService(custService);
		System.out.println("ICustomerService");
		custController.run("javaya");

	}

}
