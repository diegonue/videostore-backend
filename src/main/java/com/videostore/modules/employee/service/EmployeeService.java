package com.videostore.modules.employee.service;

import com.videostore.modules.employee.dto.EmployeeDTO;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    EmployeeDTO save(EmployeeDTO dto);
    List<EmployeeDTO> findAll();
    EmployeeDTO findById(Integer id);
    void deleteById(Integer id);
    List<EmployeeDTO> findByRoleId(Integer roleId);
    List<Map<String, Object>> countEmployeesByRole();

}
