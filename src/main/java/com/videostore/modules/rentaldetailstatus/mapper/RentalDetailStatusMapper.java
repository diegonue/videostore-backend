package com.videostore.modules.rentaldetailstatus.mapper;

import com.videostore.modules.rentaldetailstatus.dto.RentalDetailStatusDTO;
import com.videostore.modules.rentaldetailstatus.model.RentalDetailStatus;

public class RentalDetailStatusMapper {

    public static RentalDetailStatusDTO toDTO(RentalDetailStatus entity) {
        RentalDetailStatusDTO dto = new RentalDetailStatusDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static RentalDetailStatus toEntity(RentalDetailStatusDTO dto) {
        return RentalDetailStatus.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
