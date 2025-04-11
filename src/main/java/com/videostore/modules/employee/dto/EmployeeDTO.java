package com.videostore.modules.employee.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDTO {

    private Integer id;
    private String fullName;
    private String address;
    private String dni;
    private String email;
    private Integer districtId;
    private LocalDate joinDate;
    private Integer roleId;

}
