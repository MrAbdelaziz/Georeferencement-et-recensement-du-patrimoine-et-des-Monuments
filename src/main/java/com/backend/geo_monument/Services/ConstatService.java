package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.Categorie;
import com.backend.geo_monument.Models.Constat;
import com.backend.geo_monument.Repositories.ConstatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstatService {

    @Autowired
    private ConstatRepository ConstatRepository;

    public List<Constat> ListConstat() {
        return ConstatRepository.findAll();
    }

    public Constat findConstatById(Long id) {

        return ConstatRepository.findById(id).get();
    }

    public Constat addOrUpdateConstat(Constat constat) {
        return ConstatRepository.save(constat);
    }

    public void deleteConstat(Long id) {
        ConstatRepository.deleteById(id);
}
}
