package ton.example.employeemanager.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ton.example.employeemanager.entities.Employee;
import ton.example.employeemanager.exceptions.UserNotFoundException;
import ton.example.employeemanager.repositories.EmployeeRepository;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(Long Id) {
        return employeeRepository.findEmployeeById(Id).orElseThrow(
                () -> new UserNotFoundException("User by Id " + Id + " was not found")
        );
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long Id) {
        employeeRepository.deleteEmployeeById(Id);
    }
}
