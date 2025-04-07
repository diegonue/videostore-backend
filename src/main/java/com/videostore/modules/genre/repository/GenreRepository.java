package com.videostore.modules.genre.repository;

import com.videostore.modules.genre.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
