package com.videostore.modules.actor.service;

import com.videostore.modules.actor.dto.ActorDTO;
import com.videostore.modules.actor.mapper.ActorMapper;
import com.videostore.modules.actor.model.Actor;
import com.videostore.modules.actor.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    @Override
    public ActorDTO save(ActorDTO dto) {
        Actor entity = ActorMapper.toEntity(dto);
        return ActorMapper.toDTO(actorRepository.save(entity));
    }

    @Override
    public List<ActorDTO> findAll() {
        return actorRepository.findAll()
                .stream()
                .map(ActorMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ActorDTO findById(Integer id) {
        return actorRepository.findById(id)
                .map(ActorMapper::toDTO)
                .orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        actorRepository.deleteById(id);
    }

}
