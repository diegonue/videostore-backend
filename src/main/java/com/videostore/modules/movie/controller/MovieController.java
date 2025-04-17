package com.videostore.modules.movie.controller;

import com.videostore.modules.movie.dto.MovieDTO;
import com.videostore.modules.movie.service.MovieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @PostMapping
    public ResponseEntity<MovieDTO> create(@Valid @RequestBody MovieDTO dto) {
        return ResponseEntity.ok(movieService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<MovieDTO>> getAll() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> getById(@PathVariable Integer id) {
        MovieDTO dto = movieService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        movieService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/by-genre/{genreId}")
    public ResponseEntity<List<MovieDTO>> getByGenre(@PathVariable Integer genreId) {
        return ResponseEntity.ok(movieService.findByGenreId(genreId));
    }

}
