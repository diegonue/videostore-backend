package com.videostore.modules.movietype.controller;

import com.videostore.modules.movietype.dto.MovieTypeDTO;
import com.videostore.modules.movietype.service.MovieTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie-types")
@RequiredArgsConstructor
public class MovieTypeController {

    private final MovieTypeService movieTypeService;

    @PostMapping
    public ResponseEntity<MovieTypeDTO> create(@RequestBody MovieTypeDTO dto) {
        return ResponseEntity.ok(movieTypeService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<MovieTypeDTO>> getAll() {
        return ResponseEntity.ok(movieTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieTypeDTO> getById(@PathVariable Integer id) {
        MovieTypeDTO dto = movieTypeService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        movieTypeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
