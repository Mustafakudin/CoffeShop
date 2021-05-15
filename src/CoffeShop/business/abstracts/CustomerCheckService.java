package CoffeShop.business.abstracts;

import java.rmi.RemoteException;

import CoffeShop.entities.concretes.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}
