package com.keyin.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aircraft", path = "aircraft")
public interface AircraftRestApi extends JpaRepository<Aircraft, Long> {
}
