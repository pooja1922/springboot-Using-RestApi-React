package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.model.EmployeeData;

public interface DBService {

	

	ResponseEntity<List<EmployeeData>> getData();

	ResponseEntity<EmployeeData> saveData(EmployeeData emp);

	ResponseEntity<EmployeeData> getDataById(int id);

	ResponseEntity<EmployeeData> deleteById(int id);

	ResponseEntity<EmployeeData> updateById(EmployeeData emp);

	

}
