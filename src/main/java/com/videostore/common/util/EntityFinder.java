package com.videostore.common.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class EntityFinder {

    public <T, ID> T findOrThrow(JpaRepository<T, ID> repository, ID id, String entityName) {
        return repository.findById(id).orElseThrow(() ->
                new IllegalArgumentException(entityName + " con ID " + id + " no existe"));
    }

}
