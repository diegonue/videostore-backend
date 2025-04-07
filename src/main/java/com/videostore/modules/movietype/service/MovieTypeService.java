package com.videostore.modules.movietype.service;

import com.videostore.modules.movietype.dto.MovieTypeDTO;

import java.util.List;

public interface MovieTypeService {

    MovieTypeDTO save(MovieTypeDTO dto);
    List<MovieTypeDTO> findAll();
    MovieTypeDTO findById(Integer id);
    void deleteById(Integer id);

}
