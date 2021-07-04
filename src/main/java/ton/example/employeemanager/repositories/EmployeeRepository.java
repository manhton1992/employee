package ton.example.employeemanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ton.example.employeemanager.entities.Employee;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long Id);

    Optional<Employee> findEmployeeById(Long Id);

    @Query("select e from Employee e where e.email = ?1")
    List<Employee> findEmployeeByEmail(String email);
}
