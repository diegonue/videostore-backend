package com.videostore.modules.genre.service;

import com.videostore.modules.genre.dto.GenreDTO;

import java.util.List;

public interface GenreService {

    GenreDTO save(GenreDTO dto);
    List<GenreDTO> findAll();
    GenreDTO findById(Integer id);
    void deleteById(Integer id);

}
