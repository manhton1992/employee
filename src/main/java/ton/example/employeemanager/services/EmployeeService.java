package ton.example.employeemanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ton.example.employeemanager.entities.Employee;
import ton.example.employeemanager.repositories.EmployeeRepository;

import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> employees(){
        List<Employee> employees = new LinkedList<>();
        Employee employee = new Employee("ton", "developer");
        Employee employee1 = new Employee("ton1", "developer1");
        employees.add(employee);
        employees.add(employee1);
       return employees;
    }
}
