package com.backend.geo_monument.Repositories;
import com.backend.geo_monument.Models.TypeEvenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeEvenementRepository extends JpaRepository<TypeEvenement, Long> {
}
