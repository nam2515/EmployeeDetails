package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exception.AddressCanNotBeNull;
import com.capgemini.exception.DuplicateIdException;
import com.capgemini.exception.InvalidIdException;
import com.capgemini.exception.NameDoesNotExist;
import com.capgemini.exception.NameNotEnteredException;
import com.capgemini.repository.EmployeeRepoImpl;
import com.capgemini.service.EmployeeServiceImpl;

public class EmloyeeServiceImplTest {
	
	EmployeeServiceImpl empi;
	EmployeeRepoImpl emprepo;
	@Before
	public void setUp() throws Exception {
		
		new EmployeeServiceImpl(emprepo);
	}

	@Test(expected=com.capgemini.exception.InvalidIdException.class)
	public void whenIdEnteredByUserAtTheTimeOfCreationOfEmployeeIsNegativeOrZero() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull
	{
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(0, "Naman", ad);
	}
	
	@Test(expected=com.capgemini.exception.DuplicateIdException.class)
	public void whenIdEnteredAlreadyExistInTheMap() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull
	{
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(101, "Naman", ad);
		empi.createEmployee(101, "Naman", ad);
	}
	
	@Test(expected=com.capgemini.exception.NameNotEnteredException.class)
	public void whenNameIsNotEnteredAtTheTimeOfCreateEmployee() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull
	{
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(101, " ", ad);
	}
	
	@Test(expected=com.capgemini.exception.AddressCanNotBeNull.class)
	public void whenAddressIsNotEnteredAtTheCreation() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull
	{
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(101, "Naman", null);
	}
	
	@Test
	public void whenTheValidInfoIsPassed() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull
	{
		Employee emp=new Employee(0, null, null);
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(101, "Naman", ad);
	}
	
	@Test(expected=com.capgemini.exception.NameDoesNotExist.class)
	public void whenTheNameIsNotFoundWhileSearch() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull, NameDoesNotExist{
		Employee emp=new Employee(0, null, null);
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(101, "Naman", ad);
		empi.searchByName("Rajat");
	}
	
	@Test(expected=com.capgemini.exception.NameNotEnteredException.class)
	public void whenNameIsNotEnteredWhileSearching() throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull, NameDoesNotExist
	{
		Employee emp=new Employee(0, null, null);
		EmployeeRepoImpl emprepo= new EmployeeRepoImpl();
		EmployeeServiceImpl empi=new EmployeeServiceImpl(emprepo);
		City c= new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade Chowk");
		ad.setCountry(co);
		empi.createEmployee(101, "Naman", ad);
		empi.searchByName("");
	}

}
