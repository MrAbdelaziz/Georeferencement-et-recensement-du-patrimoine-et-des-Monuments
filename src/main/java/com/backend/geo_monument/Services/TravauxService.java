package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.Travaux;
import com.backend.geo_monument.Repositories.TravauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravauxService {

    @Autowired
    private TravauxRepository travauxRepository;

    public List<Travaux> ListTravaux() {
        return travauxRepository.findAll();
    }

    public Travaux findTravauxById(Long id) {

        return travauxRepository.findById(id).get();
    }

    public Travaux addOrUpdateTravaux(Travaux travaux) {
        return travauxRepository.save(travaux);
    }

    public void deleteTravaux(Long id) {
        travauxRepository.deleteById(id);}
}
