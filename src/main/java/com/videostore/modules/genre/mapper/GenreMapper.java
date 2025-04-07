package com.videostore.modules.genre.mapper;

import com.videostore.modules.genre.dto.GenreDTO;
import com.videostore.modules.genre.model.Genre;

public class GenreMapper {

    public static GenreDTO toGenreDTO(Genre entity) {
        GenreDTO dto = new GenreDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public static Genre toGenre(GenreDTO dto) {
        return Genre.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }

}
