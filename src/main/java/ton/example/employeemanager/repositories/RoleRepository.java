package ton.example.employeemanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ton.example.employeemanager.entities.ERole;
import ton.example.employeemanager.entities.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(ERole role);
}
