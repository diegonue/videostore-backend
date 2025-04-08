package com.videostore.modules.employeerole.mapper;

import com.videostore.modules.employeerole.dto.EmployeeRoleDTO;
import com.videostore.modules.employeerole.model.EmployeeRole;

public class EmployeeRoleMapper {

    public static EmployeeRoleDTO toDTO(EmployeeRole entity) {
        EmployeeRoleDTO dto = new EmployeeRoleDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static EmployeeRole toEntity(EmployeeRoleDTO dto) {
        return EmployeeRole.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
