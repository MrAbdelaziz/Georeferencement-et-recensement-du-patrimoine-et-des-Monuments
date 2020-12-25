package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.Monument;
import com.backend.geo_monument.Models.PhotoMonu;
import com.backend.geo_monument.Repositories.MonumentRepository;
import com.backend.geo_monument.Repositories.PhotoMonuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PhotoMonuService {

    @Autowired
    private PhotoMonuRepository photoMonuRepository;

    @Autowired
    private MonumentRepository monumentRepository;

    public List<PhotoMonu> ListPhotoMonument(Long monument_id) {
        return photoMonuRepository.findAllByMonumentId(monument_id);
    }

    public PhotoMonu addOrUpdatePhotoMonu(PhotoMonu photoMonu, Long monument_id) {
        Monument monument = monumentRepository.findById(monument_id).get();
        photoMonu.setMonument(monument);
        return photoMonuRepository.save(photoMonu);
    }

    public void deletePhotoMonu(Long id) {
        photoMonuRepository.deleteById(id);
    }

}
