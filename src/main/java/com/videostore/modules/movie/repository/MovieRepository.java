package com.videostore.modules.movie.repository;

import com.videostore.modules.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByGenreId(Integer genreId);

}
