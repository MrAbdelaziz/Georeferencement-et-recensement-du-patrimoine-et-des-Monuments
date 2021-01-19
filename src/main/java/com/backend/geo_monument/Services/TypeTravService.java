package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.TypeTravaux;
import com.backend.geo_monument.Repositories.TypeTravauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeTravService {
    @Autowired
    private TypeTravauxRepository typeTravauxRepository;

    public List<TypeTravaux> ListTypeTravaux() {
        return typeTravauxRepository.findAll();
    }

    public TypeTravaux findTypeTravauxById(Long id) {

        return typeTravauxRepository.findById(id).get();
    }

    public TypeTravaux addOrUpdateTypeTravaux(TypeTravaux typeTravaux) {
        return typeTravauxRepository.save(typeTravaux);
    }

    public void deleteTypeTravaux(Long id) {
        typeTravauxRepository.deleteById(id);}

}
