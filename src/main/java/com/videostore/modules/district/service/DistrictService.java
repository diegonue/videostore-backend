package com.videostore.modules.district.service;

import com.videostore.modules.district.dto.DistrictDTO;

import java.util.List;

public interface DistrictService {

    DistrictDTO save(DistrictDTO dto);
    List<DistrictDTO> findAll();
    DistrictDTO findById(Integer id);
    void deleteById(Integer id);

}
