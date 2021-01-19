package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.TypeEvenement;
import com.backend.geo_monument.Repositories.TypeEvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeEventService {

    @Autowired
    private TypeEvenementRepository typeEvenementRepository;

    public List<TypeEvenement> ListTypeEvenement() {
        return typeEvenementRepository.findAll();
    }

    public TypeEvenement findTypeEvenementById(Long id) {

        return typeEvenementRepository.findById(id).get();
    }

    public TypeEvenement addOrUpdateTypeEvenement(TypeEvenement typeEvenement) {
        return typeEvenementRepository.save(typeEvenement);
    }

    public void deleteTypeEvenement(Long id) {
        typeEvenementRepository.deleteById(id);}

}
