package com.videostore.modules.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberDTO {

    private Integer id;

    @NotBlank(message = "El nombre es obligatorio")
    private String fullName;

    @NotBlank(message = "La dirección es obligatoria")
    private String address;

    @NotBlank(message = "El DNI es obligatorio")
    private String dni;

    @Email(message = "El correo no es válido")
    @NotBlank(message = "El correo es obligatorio")
    private String email;

    @NotNull(message = "Debes seleccionar un distrito")
    private Integer districtId;

    @NotNull(message = "La fecha de registro es obligatoria")
    private LocalDate registrationDate;

}
