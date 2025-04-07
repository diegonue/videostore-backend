package com.videostore.modules.genre.service;

import com.videostore.modules.genre.dto.GenreDTO;
import com.videostore.modules.genre.mapper.GenreMapper;
import com.videostore.modules.genre.model.Genre;
import com.videostore.modules.genre.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public GenreDTO save(GenreDTO dto) {
        Genre entity = GenreMapper.toEntity(dto);
        return GenreMapper.toDTO(genreRepository.save(entity));
    }

    @Override
    public List<GenreDTO> findAll() {
        return genreRepository.findAll()
                .stream()
                .map(GenreMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GenreDTO findById(Integer id) {
        return genreRepository.findById(id)
                .map(GenreMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        genreRepository.deleteById(id);
    }
}
