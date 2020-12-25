package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.CategoryMonu;
import com.backend.geo_monument.Models.TypeMonu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMonuRepository extends JpaRepository<TypeMonu, Long> { }
