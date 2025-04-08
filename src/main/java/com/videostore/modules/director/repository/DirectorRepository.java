package com.videostore.modules.director.repository;

import com.videostore.modules.director.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, Integer> {
}
