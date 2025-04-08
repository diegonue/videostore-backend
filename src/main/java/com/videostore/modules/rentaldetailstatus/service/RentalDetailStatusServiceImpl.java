package com.videostore.modules.rentaldetailstatus.service;

import com.videostore.modules.rentaldetailstatus.dto.RentalDetailStatusDTO;
import com.videostore.modules.rentaldetailstatus.mapper.RentalDetailStatusMapper;
import com.videostore.modules.rentaldetailstatus.model.RentalDetailStatus;
import com.videostore.modules.rentaldetailstatus.repository.RentalDetailStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RentalDetailStatusServiceImpl implements RentalDetailStatusService {

    private final RentalDetailStatusRepository rentalDetailStatusRepository;

    @Override
    public RentalDetailStatusDTO save(RentalDetailStatusDTO dto) {
        RentalDetailStatus entity = RentalDetailStatusMapper.toEntity(dto);
        return RentalDetailStatusMapper.toDTO(rentalDetailStatusRepository.save(entity));
    }

    @Override
    public List<RentalDetailStatusDTO> findAll() {
        return rentalDetailStatusRepository.findAll()
                .stream()
                .map(RentalDetailStatusMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RentalDetailStatusDTO findById(Integer id) {
        return rentalDetailStatusRepository.findById(id)
                .map(RentalDetailStatusMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        rentalDetailStatusRepository.deleteById(id);
    }

}
