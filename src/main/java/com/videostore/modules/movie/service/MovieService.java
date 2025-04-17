package com.videostore.modules.movie.service;

import com.videostore.modules.movie.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    MovieDTO save(MovieDTO dto);
    List<MovieDTO> findAll();
    MovieDTO findById(Integer id);
    void deleteById(Integer id);
    List<MovieDTO> findByGenreId(Integer genreId);

}
