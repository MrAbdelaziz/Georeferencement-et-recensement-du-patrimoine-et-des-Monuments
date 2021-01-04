package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.Categorie;
import com.backend.geo_monument.Models.CategoryMonu;
import com.backend.geo_monument.Repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> ListCategorie() {
        return categorieRepository.findAll();
    }

    public Categorie findCategorieById(Long id) {

        return categorieRepository.findById(id).get();
    }

    public Categorie addOrUpdateCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
