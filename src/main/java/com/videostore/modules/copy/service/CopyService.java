package com.videostore.modules.copy.service;

import com.videostore.modules.copy.dto.CopyDTO;

import java.util.List;

public interface CopyService {

    CopyDTO save(CopyDTO dto);
    List<CopyDTO> findAll();
    CopyDTO findById(Integer id);
    void deleteById(Integer id);

}
