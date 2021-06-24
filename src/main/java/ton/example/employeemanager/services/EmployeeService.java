package ton.example.employeemanager.services;

import ton.example.employeemanager.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public List<Employee> findAllEmployees();
    public Employee findEmployeeById(Long Id);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployeeById(Long Id);
}
