package com.videostore.modules.actor.mapper;

import com.videostore.modules.actor.dto.ActorDTO;
import com.videostore.modules.actor.model.Actor;

public class ActorMapper {

    public static ActorDTO toDTO(Actor entity) {
        ActorDTO dto = new ActorDTO();
        dto.setId(entity.getId());
        dto.setFullName(entity.getFullName());
        return dto;
    }

    public static Actor toEntity(ActorDTO dto) {
        return Actor.builder()
                .id(dto.getId())
                .fullName(dto.getFullName())
                .build();
    }

}
