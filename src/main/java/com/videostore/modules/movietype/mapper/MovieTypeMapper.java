package com.videostore.modules.movietype.mapper;

import com.videostore.modules.movietype.dto.MovieTypeDTO;
import com.videostore.modules.movietype.model.MovieType;

public class MovieTypeMapper {

    public static MovieTypeDTO toDTO(MovieType entity) {
        MovieTypeDTO dto = new MovieTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static MovieType toEntity(MovieTypeDTO dto) {
        return MovieType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
