package com.capgemini.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.capgemini.beans.Employee;
import com.capgemini.exception.DuplicateIdException;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	Employee emp;
	HashMap<Integer, Employee> hs=new HashMap<>();
	
	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub
		hs.put(e.getId(),e);
		return e;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> l=new ArrayList<>();
		hs.forEach((m,n)->{
			if(name==n.getEmpName())
				l.add(n);
		});
		return l;
	}

	boolean x=false;
	@Override
	public boolean findById(int id) {
		hs.forEach((m,n)->{
			if(id==(Integer)n.getId())
				x=true;
		});
		return x;
	}

}
