package com.videostore.modules.copy.service;

import com.videostore.modules.copy.dto.CopyDTO;
import com.videostore.modules.copy.mapper.CopyMapper;
import com.videostore.modules.copy.model.Copy;
import com.videostore.modules.copy.repository.CopyRepository;
import com.videostore.modules.copystatus.model.CopyStatus;
import com.videostore.modules.copystatus.repository.CopyStatusRepository;
import com.videostore.modules.movie.model.Movie;
import com.videostore.modules.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CopyServiceImpl implements CopyService {

    private final CopyRepository copyRepository;
    private final MovieRepository movieRepository;
    private final CopyStatusRepository copyStatusRepository;

    @Override
    public CopyDTO save(CopyDTO dto) {
        Movie movie = movieRepository.findById(dto.getMovieId()).orElseThrow();
        CopyStatus copyStatus = copyStatusRepository.findById(dto.getStatusId()).orElseThrow();

        Copy copy = CopyMapper.toEntity(dto, movie, copyStatus);
        return CopyMapper.toDTO(copyRepository.save(copy));
    }

    @Override
    public List<CopyDTO> findAll() {
        return copyRepository.findAll().stream()
                .map(CopyMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CopyDTO findById(Integer id) {
        return copyRepository.findById(id)
                .map(CopyMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        copyRepository.deleteById(id);
    }
}
