package CoffeShop.adapters;

import java.rmi.RemoteException;

import CoffeShop.business.abstracts.CustomerCheckService;
import CoffeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

        boolean result = client.TCKimlikNoDogrula(
                customer.getNationalIdentity(),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth());
		return result;
	}
	

}
