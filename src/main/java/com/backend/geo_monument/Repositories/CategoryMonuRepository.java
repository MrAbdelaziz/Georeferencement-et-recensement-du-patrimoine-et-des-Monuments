package com.backend.geo_monument.Repositories;

import com.backend.geo_monument.Models.CategoryMonu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMonuRepository extends JpaRepository<CategoryMonu, Long> { }
