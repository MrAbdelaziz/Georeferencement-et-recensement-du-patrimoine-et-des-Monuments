package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.PhotoMonu;
import com.backend.geo_monument.Models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoMonuRepository extends JpaRepository<PhotoMonu, Long> {
    List<PhotoMonu> findAllByMonumentId(Long id);
}
