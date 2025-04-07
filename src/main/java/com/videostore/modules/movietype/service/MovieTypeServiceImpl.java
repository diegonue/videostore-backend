package com.videostore.modules.movietype.service;

import com.videostore.modules.movietype.dto.MovieTypeDTO;
import com.videostore.modules.movietype.mapper.MovieTypeMapper;
import com.videostore.modules.movietype.model.MovieType;
import com.videostore.modules.movietype.repository.MovieTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieTypeServiceImpl implements MovieTypeService{

    private final MovieTypeRepository movieTypeRepository;

    @Override
    public MovieTypeDTO save(MovieTypeDTO dto) {
        MovieType entity = MovieTypeMapper.toEntity(dto);
        return MovieTypeMapper.toDTO(movieTypeRepository.save(entity));
    }

    @Override
    public List<MovieTypeDTO> findAll() {
        return movieTypeRepository.findAll()
                .stream()
                .map(MovieTypeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MovieTypeDTO findById(Integer id) {
        return movieTypeRepository.findById(id)
                .map(MovieTypeMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        movieTypeRepository.deleteById(id);
    }
}
