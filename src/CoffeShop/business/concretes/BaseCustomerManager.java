package CoffeShop.business.concretes;

import java.rmi.RemoteException;

import CoffeShop.business.abstracts.CustomerService;
import CoffeShop.entities.concretes.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) throws RemoteException {
		System.out.println("SAVE TO DATABASE " + customer.getFirstName());
	}
	

}
