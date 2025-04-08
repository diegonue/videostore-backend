package com.videostore.modules.rentaldetailstatus.service;

import com.videostore.modules.rentaldetailstatus.dto.RentalDetailStatusDTO;

import java.util.List;

public interface RentalDetailStatusService {

    RentalDetailStatusDTO save(RentalDetailStatusDTO dto);
    List<RentalDetailStatusDTO> findAll();
    RentalDetailStatusDTO findById(Integer id);
    void deleteById(Integer id);

}
