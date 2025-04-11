package com.videostore.modules.employee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDTO {

    private Integer id;

    @NotBlank(message = "El nombre es obligatorio")
    private String fullName;

    @NotBlank(message = "La dirección es obligatoria")
    private String address;

    @NotBlank(message = "El DNI es obligatorio")
    private String dni;

    @NotBlank(message = "El correo  es obligatorio")
    @Email(message = "Correo no es válido")
    private String email;

    @NotNull(message = "Debes seleccionar un distrito")
    private Integer districtId;

    @NotNull(message = "La fecha de ingreso es obligatoria")
    private LocalDate joinDate;

    @NotNull(message = "Debes seleccionar un rol")
    private Integer roleId;

}
