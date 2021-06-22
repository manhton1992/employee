package ton.example.employeemanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ton.example.employeemanager.entities.Employee;
import ton.example.employeemanager.repositories.EmployeeRepository;
import ton.example.employeemanager.services.EmployeeService;

import java.util.List;

@Component
@RestController
@RequestMapping
public class EmployeeContoller {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public String employees() {
       return employeeService.employees().toString();
    }

}
