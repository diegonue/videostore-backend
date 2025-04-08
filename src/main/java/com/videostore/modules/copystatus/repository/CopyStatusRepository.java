package com.videostore.modules.copystatus.repository;

import com.videostore.modules.copystatus.model.CopyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CopyStatusRepository extends JpaRepository<CopyStatus, Integer> {
}
