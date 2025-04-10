package com.videostore.modules.copy.mapper;

import com.videostore.modules.copy.dto.CopyDTO;
import com.videostore.modules.copy.model.Copy;
import com.videostore.modules.copystatus.model.CopyStatus;
import com.videostore.modules.movie.model.Movie;

public class CopyMapper {

    public static CopyDTO toDTO(Copy entity) {
        CopyDTO dto = new CopyDTO();
        dto.setId(entity.getId());
        dto.setMovieId(entity.getMovie().getId());
        dto.setStatusId(entity.getCopyStatus().getId());
        return dto;
    }

    public static Copy toEntity(CopyDTO dto, Movie movie, CopyStatus copyStatus) {
        return Copy.builder()
                .id(dto.getId())
                .movie(movie)
                .copyStatus(copyStatus)
                .build();
    }

}
