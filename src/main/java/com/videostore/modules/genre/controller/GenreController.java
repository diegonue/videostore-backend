package com.videostore.modules.genre.controller;

import com.videostore.modules.genre.dto.GenreDTO;
import com.videostore.modules.genre.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @PostMapping
    public ResponseEntity<GenreDTO> create(@RequestBody GenreDTO dto) {
        return ResponseEntity.ok(genreService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<GenreDTO>> getAll(){
        return ResponseEntity.ok(genreService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreDTO> getById(@PathVariable Integer id){
        GenreDTO dto = genreService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        genreService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
