package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exception.AddressCanNotBeNull;
import com.capgemini.exception.DuplicateIdException;
import com.capgemini.exception.InvalidIdException;
import com.capgemini.exception.NameDoesNotExist;
import com.capgemini.exception.NameNotEnteredException;

public interface EmployeeService {
	List<Employee> searchByName(String name) throws NameNotEnteredException, NameDoesNotExist;
	Employee createEmployee(int id, String name, Address addressLine) throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull;
}
