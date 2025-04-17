package com.videostore.modules.employee.repository;

import com.videostore.modules.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByRoleId(Integer roleId);

}
