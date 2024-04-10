package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.model.EmployeeData;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements DBService {
@Autowired
private EmployeeRepository repo;
	
	@Override
	public ResponseEntity<List<EmployeeData>> getData() {
		
			return new ResponseEntity<List<EmployeeData>>(repo.findAll(),HttpStatus.OK);
		
		
	}

	@Override
	public ResponseEntity<EmployeeData> saveData(EmployeeData emp)
	{
		if (repo.existsById(emp.getId()))
	{
		return new ResponseEntity<EmployeeData>(HttpStatus.ALREADY_REPORTED);
	}
	else
	{
		return new ResponseEntity<EmployeeData>(repo.save(emp),HttpStatus.CREATED);
	}
	}

	@Override
	public ResponseEntity<EmployeeData> getDataById(int id) {
		if(repo.existsById(id))
		{
			return new ResponseEntity<EmployeeData>(repo.findById(id).get(),HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<EmployeeData>(HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public ResponseEntity<EmployeeData> deleteById(int id) {
	    Optional<EmployeeData> optional = repo.findById(id);
	    if (optional.isPresent()) {
	        repo.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	@Override
	public ResponseEntity<EmployeeData> updateById(EmployeeData emp) 
	{
		if(repo.existsById(emp.getId()))
		{
			return new ResponseEntity<EmployeeData>(repo.save(emp),HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<EmployeeData>(HttpStatus.CONFLICT);
		}
		
	}

}
