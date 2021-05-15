package CoffeShop.entities.concretes;

import java.time.LocalDate;

import CoffeShop.entities.abstracts.Entity;

public class Customer implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private long nationalIdentity;
	
	public Customer() {	}

	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(long nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}


	
}

