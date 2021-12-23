package com.example.bai13.controller;


import com.example.bai13.model.Employee;
import com.example.bai13.model.Intern;
import com.example.bai13.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService es;



    @PostMapping("/addIntern")
    public String addIntern(@RequestBody Employee employee){
        try {
            Intern i = employee.getIntern();
            System.out.printf(i.toString());

            i.setEmployee(employee);
            employee.setEmployee_type(1);

            es.add(employee);


            return employee.toString();
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        es.delete(id);
        return "delete success";
    }


    @PostMapping("/add1")
    public String addIntern1(@RequestBody Employee employee){
        return employee.toString();
    }

}
