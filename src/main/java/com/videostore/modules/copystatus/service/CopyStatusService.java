package com.videostore.modules.copystatus.service;

import com.videostore.modules.copystatus.dto.CopyStatusDTO;

import java.util.List;

public interface CopyStatusService {

    CopyStatusDTO save(CopyStatusDTO dto);
    List<CopyStatusDTO> findAll();
    CopyStatusDTO findById(Integer id);
    void deleteById(Integer id);

}
