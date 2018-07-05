import com.javaya.controller.CustomerController;
import com.javaya.service.*;

public class CustomerMain {

	public static void main(String[] args) {
		ICustomerService custService = new CustomerService();
		CustomerController custController = new CustomerController();
		
		custController.setCustomerService(custService);
		custController.run("javaya");

	}

}
