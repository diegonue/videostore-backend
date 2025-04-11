package com.videostore.modules.member.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberDTO {

    private Integer id;
    private String fullName;
    private String address;
    private String dni;
    private String email;
    private Integer districtId;
    private LocalDate registrationDate;

}
