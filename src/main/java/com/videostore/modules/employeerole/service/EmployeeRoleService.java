package com.videostore.modules.employeerole.service;

import com.videostore.modules.employeerole.dto.EmployeeRoleDTO;

import java.util.List;

public interface EmployeeRoleService {

    EmployeeRoleDTO save(EmployeeRoleDTO dto);
    List<EmployeeRoleDTO> findAll();
    EmployeeRoleDTO findById(Integer id);
    void deleteById(Integer id);

}
