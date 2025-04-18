package com.videostore.modules.employee.repository;

import com.videostore.modules.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByRoleId(Integer roleId);

    @Query("SELECT r.name, COUNT(e.id) FROM Employee e JOIN e.role r GROUP BY r.name")
    List<Object[]> countEmployeesByRole();

}
