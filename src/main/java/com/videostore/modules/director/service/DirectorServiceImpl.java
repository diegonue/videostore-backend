package com.videostore.modules.director.service;

import com.videostore.modules.director.dto.DirectorDTO;
import com.videostore.modules.director.mapper.DirectorMapper;
import com.videostore.modules.director.model.Director;
import com.videostore.modules.director.repository.DirectorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService{

    private final DirectorRepository directorRepository;

    @Override
    public DirectorDTO save(DirectorDTO dto) {
        Director entity = DirectorMapper.toEntity(dto);
        return DirectorMapper.toDTO(directorRepository.save(entity));
    }

    @Override
    public List<DirectorDTO> findAll() {
        return directorRepository.findAll()
                .stream()
                .map(DirectorMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DirectorDTO findById(Integer id) {
        return directorRepository.findById(id)
                .map(DirectorMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        directorRepository.deleteById(id);
    }

}
