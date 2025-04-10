package com.videostore.modules.copy.repository;

import com.videostore.modules.copy.model.Copy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CopyRepository extends JpaRepository<Copy, Integer> {
}
