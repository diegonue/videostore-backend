package com.videostore.modules.member.mapper;

import com.videostore.modules.district.model.District;
import com.videostore.modules.member.dto.MemberDTO;
import com.videostore.modules.member.model.Member;

public class MemberMapper {

    public static MemberDTO toDTO(Member entity) {
        MemberDTO dto = new MemberDTO();
        dto.setId(entity.getId());
        dto.setFullName(entity.getFullName());
        dto.setAddress(entity.getAddress());
        dto.setDni(entity.getDni());
        dto.setEmail(entity.getEmail());
        dto.setDistrictId(entity.getDistrict().getId());
        dto.setRegistrationDate(entity.getRegistrationDate());
        return dto;
    }

    public static Member toEntity(MemberDTO dto, District district) {
        return Member.builder()
                .id(dto.getId())
                .fullName(dto.getFullName())
                .address(dto.getAddress())
                .dni(dto.getDni())
                .email(dto.getEmail())
                .district(district)
                .registrationDate(dto.getRegistrationDate())
                .build();
    }

}
