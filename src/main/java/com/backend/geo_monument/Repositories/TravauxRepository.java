package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.Travaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravauxRepository extends JpaRepository<Travaux, Long>{
}
