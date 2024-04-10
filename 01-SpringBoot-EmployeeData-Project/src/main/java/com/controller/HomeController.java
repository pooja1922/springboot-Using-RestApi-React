package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.EmployeeData;
import com.service.DBService;

@RestController
@RequestMapping("/emp-service")
@CrossOrigin("*")
public class HomeController 
{
@Autowired
private DBService service;
@RequestMapping("/greet")
public String greet() 
{
	return"welcome to web service";
}
@PostMapping("/") //@RequstMapping("/")
public ResponseEntity<EmployeeData> saveData(@RequestBody EmployeeData emp)
{
	return  service.saveData(emp);
}


@GetMapping("/")  //@RequstMapping("/getdata")
public ResponseEntity<List<EmployeeData>> getData()
{
	return service.getData();
}

@GetMapping("/{id}") //@RequestMapping("/getDataById/{id}")
public ResponseEntity<EmployeeData>getDataById(@PathVariable int id)
{
	return service.getDataById(id);
}

@DeleteMapping("/{id}") //@RequestMapping("/deleteById/{id}")
public ResponseEntity<EmployeeData> deleteById(@PathVariable int id)
{
	return service.deleteById(id);
	
}

@PutMapping("/{id}") //@RequestMapping("/updateById/{id}")
public ResponseEntity<EmployeeData> updateById(@RequestBody EmployeeData emp )
{
	return service.updateById(emp);
	
}
}
