package com.example.bai13.repository;

import com.example.bai13.dto.EmployeeDTO;
import com.example.bai13.model.Employee;
import com.example.bai13.model.Intern;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {



}
