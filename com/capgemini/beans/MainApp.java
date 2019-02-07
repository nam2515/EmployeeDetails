package com.capgemini.beans;
import com.capgemini.exception.AddressCanNotBeNull;
import com.capgemini.exception.DuplicateIdException;
import com.capgemini.exception.InvalidIdException;
import com.capgemini.exception.NameDoesNotExist;
import com.capgemini.exception.NameNotEnteredException;
import com.capgemini.repository.EmployeeRepoImpl;
import com.capgemini.service.EmployeeServiceImpl;

public class MainApp {
	
	public static void main(String[] args) throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull, NameDoesNotExist {
		// TODO Auto-generated method stub
		EmployeeRepoImpl empr=new EmployeeRepoImpl();
		EmployeeServiceImpl emps= new EmployeeServiceImpl(empr);
		City c=new City();
		c.setCityName("Pune");
		Country co=new Country();
		co.setCountryName("India");
		co.setCityName(c);
		Address ad=new Address();
		ad.setAddressLine("Talwade chowk");
		ad.setCountry(co);
		
		emps.createEmployee(101, "Naman", ad);
		emps.createEmployee(-10, "Naman", ad);
		System.out.println(emps.searchByName(" "));
	}

}
