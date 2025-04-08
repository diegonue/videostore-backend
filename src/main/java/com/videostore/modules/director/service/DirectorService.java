package com.videostore.modules.director.service;

import com.videostore.modules.director.dto.DirectorDTO;

import java.util.List;

public interface DirectorService {

    DirectorDTO save(DirectorDTO dto);
    List<DirectorDTO> findAll();
    DirectorDTO findById(Integer id);
    void deleteById(Integer id);

}
