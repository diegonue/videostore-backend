package com.videostore.modules.employee.mapper;

import com.videostore.modules.district.model.District;
import com.videostore.modules.employee.dto.EmployeeDTO;
import com.videostore.modules.employee.model.Employee;
import com.videostore.modules.employeerole.model.EmployeeRole;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee e) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(e.getId());
        dto.setFullName(e.getFullName());
        dto.setAddress(e.getAddress());
        dto.setDni(e.getDni());
        dto.setEmail(e.getEmail());
        dto.setDistrictId(e.getDistrict().getId());
        dto.setJoinDate(e.getJoinDate());
        dto.setRoleId(e.getRole().getId());
        return dto;
    }

    public static Employee toEntity(EmployeeDTO dto, District district, EmployeeRole role) {
        return Employee.builder()
                .fullName(dto.getFullName())
                .address(dto.getAddress())
                .dni(dto.getDni())
                .email(dto.getEmail())
                .district(district)
                .joinDate(dto.getJoinDate())
                .role(role)
                .build();
    }
}