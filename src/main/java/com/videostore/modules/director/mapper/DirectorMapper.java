package com.videostore.modules.director.mapper;

import com.videostore.modules.director.dto.DirectorDTO;
import com.videostore.modules.director.model.Director;

public class DirectorMapper {

    public static DirectorDTO toDTO(Director entity) {
        DirectorDTO dto = new DirectorDTO();
        dto.setId(entity.getId());
        dto.setFullName(entity.getFullName());
        return dto;
    }

    public static Director toEntity(DirectorDTO dto) {
        return Director.builder()
                .id(dto.getId())
                .fullName(dto.getFullName())
                .build();
    }

}
