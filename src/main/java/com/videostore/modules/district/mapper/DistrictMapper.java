package com.videostore.modules.district.mapper;

import com.videostore.modules.district.dto.DistrictDTO;
import com.videostore.modules.district.model.District;

public class DistrictMapper {

    public static DistrictDTO toDTO(District entity){
        DistrictDTO dto = new DistrictDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static District toEntity(DistrictDTO dto){
        return District.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
