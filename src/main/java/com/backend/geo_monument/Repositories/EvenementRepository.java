package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
}
