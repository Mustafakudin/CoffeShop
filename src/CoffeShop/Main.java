package CoffeShop;

import CoffeShop.adapters.MernisServiceAdapters;
import CoffeShop.business.concretes.BaseCustomerManager;
import CoffeShop.business.concretes.StarbucksCustomerManager;
import CoffeShop.entities.concretes.Customer;

public class Main {
	public static void main(String []args) throws Exception {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		baseCustomerManager.add(new Customer(1,"Mustafa","Kudin", 1999,11111111111L)); // L=12 TUTUYOR
	}

}
