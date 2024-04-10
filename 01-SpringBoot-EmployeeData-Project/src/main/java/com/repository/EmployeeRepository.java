package com.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.EmployeeData;


public interface EmployeeRepository extends JpaRepository<EmployeeData,Integer> {

}
