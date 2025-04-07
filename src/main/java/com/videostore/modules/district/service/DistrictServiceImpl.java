package com.videostore.modules.district.service;

import com.videostore.modules.district.dto.DistrictDTO;
import com.videostore.modules.district.mapper.DistrictMapper;
import com.videostore.modules.district.model.District;
import com.videostore.modules.district.repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    @Override
    public DistrictDTO save(DistrictDTO dto) {
        District entity = DistrictMapper.toEntity(dto);
        return DistrictMapper.toDTO(districtRepository.save(entity));
    }

    @Override
    public List<DistrictDTO> findAll() {
        return districtRepository.findAll()
                .stream()
                .map(DistrictMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DistrictDTO findById(Integer id) {
        return districtRepository.findById(id)
                .map(DistrictMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        districtRepository.deleteById(id);
    }
}
