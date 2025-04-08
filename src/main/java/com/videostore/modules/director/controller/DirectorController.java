package com.videostore.modules.director.controller;

import com.videostore.modules.director.dto.DirectorDTO;
import com.videostore.modules.director.service.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directors")
@RequiredArgsConstructor
public class DirectorController {

    private final DirectorService directorService;

    @PostMapping
    public ResponseEntity<DirectorDTO> create(@RequestBody DirectorDTO dto) {
        return ResponseEntity.ok(directorService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<DirectorDTO>> getAll() {
        return ResponseEntity.ok(directorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorDTO> getById(@PathVariable Integer id) {
        DirectorDTO dto = directorService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        directorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
