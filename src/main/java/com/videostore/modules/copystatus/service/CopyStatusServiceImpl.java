package com.videostore.modules.copystatus.service;

import com.videostore.modules.copystatus.dto.CopyStatusDTO;
import com.videostore.modules.copystatus.mapper.CopyStatusMapper;
import com.videostore.modules.copystatus.model.CopyStatus;
import com.videostore.modules.copystatus.repository.CopyStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CopyStatusServiceImpl implements CopyStatusService {

    private final CopyStatusRepository copyStatusRepository;

    @Override
    public CopyStatusDTO save(CopyStatusDTO dto) {
        CopyStatus entity = CopyStatusMapper.toEntity(dto);
        return CopyStatusMapper.toDTO(copyStatusRepository.save(entity));
    }

    @Override
    public List<CopyStatusDTO> findAll() {
        return copyStatusRepository.findAll()
                .stream()
                .map(CopyStatusMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CopyStatusDTO findById(Integer id) {
        return copyStatusRepository.findById(id)
                .map(CopyStatusMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        copyStatusRepository.deleteById(id);
    }
}
