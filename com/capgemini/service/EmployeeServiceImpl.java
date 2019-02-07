package com.capgemini.service;

import java.util.HashMap;
import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exception.AddressCanNotBeNull;
import com.capgemini.exception.DuplicateIdException;
import com.capgemini.exception.InvalidIdException;
import com.capgemini.exception.NameDoesNotExist;
import com.capgemini.exception.NameNotEnteredException;
import com.capgemini.repository.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	HashMap<Integer, Employee> hm=new HashMap<>();
	
	EmployeeRepo emprepo;
	
	public EmployeeServiceImpl(EmployeeRepo emprepo)     
	{
		super();
		this.emprepo=emprepo;
	}
	@Override
	public Employee createEmployee(int id,String name, Address addressLine) throws InvalidIdException, DuplicateIdException, NameNotEnteredException, AddressCanNotBeNull {
		if(id<=0)
		{
			throw new InvalidIdException();
		}
		if(emprepo.findById(id))
		{
			throw new DuplicateIdException();
		}
		if(name==" "|| name==null)
		{
			throw new NameNotEnteredException();
		}
		if(addressLine==null)
		{
			throw new AddressCanNotBeNull();
		}
		Employee emp=new Employee(id, name, addressLine);
		emp.setId(id);
		emp.setEmpName(name);
		emp.setAddressLine(addressLine);
		hm.put(id,emprepo.save(emp));
		return emp;
	}

	@Override
	public List<Employee> searchByName(String name) throws NameNotEnteredException, NameDoesNotExist {
		// TODO Auto-generated method stub
		if(name=="")
			throw new NameNotEnteredException();
		List<Employee> l=emprepo.findByName(name);
		if(l.size()==0)
			throw new NameDoesNotExist();
		return l;
	}
}
