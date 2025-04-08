package com.videostore.modules.actor.service;

import com.videostore.modules.actor.dto.ActorDTO;

import java.util.List;

public interface ActorService {

    ActorDTO save(ActorDTO dto);
    List<ActorDTO> findAll();
    ActorDTO findById(Integer id);
    void deleteById(Integer id);

}
