package com.videostore.modules.movietype.repository;

import com.videostore.modules.movietype.model.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTypeRepository extends JpaRepository<MovieType, Integer> {
}
