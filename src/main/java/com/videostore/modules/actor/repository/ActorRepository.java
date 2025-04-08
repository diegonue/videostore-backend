package com.videostore.modules.actor.repository;

import com.videostore.modules.actor.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
