package com.backend.geo_monument.Services;

import com.backend.geo_monument.Enum.StatusMonu;
import com.backend.geo_monument.Models.Monument;
import com.backend.geo_monument.Models.Region;
import com.backend.geo_monument.Repositories.MonumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MonumentService {

    @Autowired
    private MonumentRepository monumentRepository;
    @Autowired
    private RegionService regionService;

    public ArrayList<Monument> ListMonuments() {
        return (ArrayList<Monument>) monumentRepository.findAll();
    }

    public Monument findMonumentById(Long id) {
        return monumentRepository.findById(id).get();
    }

    public Monument addMonument(Monument monument) {
        Region region = regionService.addRegion(monument.getRegion());
        monument.setRegion(region);
        monument.setStatus(StatusMonu.RUNNING);
        return monumentRepository.save(monument);
    }

    public Monument updateMonument(Monument monument) {
        return monumentRepository.save(monument);
    }

    public void deleteMonument(Long id) {
        monumentRepository.deleteById(id);
    }

}
