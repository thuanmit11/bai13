package com.example.bai13.service;


import com.example.bai13.dto.EmployeeDTO;
import com.example.bai13.model.Employee;
import com.example.bai13.model.Intern;
import com.example.bai13.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


//    public Iterable<Employee> getAllEmployees(){
//        Iterable<Employee> es =  employeeRepository.findAll();
//
//        return es;
//    }



    public void add(Employee e){
          employeeRepository.save(e);

    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }



}
