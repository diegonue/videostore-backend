package com.videostore.modules.movie.repository;

import com.videostore.modules.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByGenreId(Integer genreId);

    @Query("SELECT g.name, COUNT(m.id) FROM Movie m JOIN m.genre g GROUP BY g.name")
    List<Object[]> countMoviesByGenre();

}
