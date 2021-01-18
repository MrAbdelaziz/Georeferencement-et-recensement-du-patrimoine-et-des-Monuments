package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.PhotoConstat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoConstatRepository extends JpaRepository<PhotoConstat, Long> {
}
