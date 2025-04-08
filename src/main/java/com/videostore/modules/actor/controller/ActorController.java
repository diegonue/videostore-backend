package com.videostore.modules.actor.controller;

import com.videostore.modules.actor.dto.ActorDTO;
import com.videostore.modules.actor.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @PostMapping
    public ResponseEntity<ActorDTO> create(@RequestBody ActorDTO dto) {
        return ResponseEntity.ok(actorService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<ActorDTO>> getAll() {
        return ResponseEntity.ok(actorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActorDTO> getById(@PathVariable Integer id) {
        ActorDTO dto = actorService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        actorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
