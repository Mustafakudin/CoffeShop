package CoffeShop.business.concretes;

import java.rmi.RemoteException;

import CoffeShop.business.abstracts.CustomerCheckService;
import CoffeShop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService ;
	
	public StarbucksCustomerManager (CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void add(Customer customer) throws RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
		}
		else {
			System.out.println(" Not a valid Person !!");
		}
		
	}
	
	
	

}
