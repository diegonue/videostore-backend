package com.videostore.modules.movie.service;

import com.videostore.modules.movie.dto.MovieDTO;

import java.util.List;
import java.util.Map;

public interface MovieService {

    MovieDTO save(MovieDTO dto);
    List<MovieDTO> findAll();
    MovieDTO findById(Integer id);
    void deleteById(Integer id);
    List<MovieDTO> findByGenreId(Integer genreId);
    List<Map<String, Object>> countMoviesByGenre();

}
