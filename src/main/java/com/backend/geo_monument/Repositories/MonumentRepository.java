package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.Monument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, Long> { }
