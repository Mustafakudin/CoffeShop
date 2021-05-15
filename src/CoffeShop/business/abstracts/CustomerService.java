package CoffeShop.business.abstracts;

import java.rmi.RemoteException;

import CoffeShop.entities.concretes.Customer;

public interface CustomerService {

	void add(Customer customer) throws RemoteException;
}
