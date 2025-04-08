package com.videostore.modules.copystatus.mapper;

import com.videostore.modules.copystatus.dto.CopyStatusDTO;
import com.videostore.modules.copystatus.model.CopyStatus;

public class CopyStatusMapper {

    public static CopyStatusDTO toDTO(CopyStatus entity) {
        CopyStatusDTO dto = new CopyStatusDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static CopyStatus toEntity(CopyStatusDTO dto) {
        return CopyStatus.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
