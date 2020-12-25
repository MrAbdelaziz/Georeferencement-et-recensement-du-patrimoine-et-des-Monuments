package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.Region;
import com.backend.geo_monument.Repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public Region addRegion(Region region) {
        return regionRepository.save(region);
    }

}
