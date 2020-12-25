package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.CategoryMonu;
import com.backend.geo_monument.Repositories.CategoryMonuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryMonuService {

    @Autowired
    private CategoryMonuRepository categoryMonuRepository;

    public List<CategoryMonu> ListCategoryMonu() {
        return categoryMonuRepository.findAll();
    }

    public CategoryMonu findCategoryMonuById(Long id) {
        return categoryMonuRepository.findById(id).get();
    }

    public CategoryMonu addOrUpdateCategoryMonu(CategoryMonu categoryMonu) {
        return categoryMonuRepository.save(categoryMonu);
    }

    public void deleteCategoryMonu(Long id) {
        categoryMonuRepository.deleteById(id);
    }

}
