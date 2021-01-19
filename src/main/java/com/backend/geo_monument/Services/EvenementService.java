package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.Constat;
import com.backend.geo_monument.Models.Evenement;
import com.backend.geo_monument.Repositories.ConstatRepository;
import com.backend.geo_monument.Repositories.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {

    @Autowired
    private EvenementRepository evenementRepository;

    public List<Evenement> ListEvenement() {
        return evenementRepository.findAll();
    }

    public Evenement findEvenementById(Long id) {

        return evenementRepository.findById(id).get();
    }

    public Evenement addOrUpdateEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    public void deleteEvenement(Long id) {
        evenementRepository.deleteById(id);
}
}
