package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.PhotoConstat;
import com.backend.geo_monument.Repositories.PhotoConstatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoConsService {
    @Autowired
    private PhotoConstatRepository photoConstatRepository;

    public List<PhotoConstat> ListPhotoConstat() {
        return photoConstatRepository.findAll();
    }

    public PhotoConstat findPhotoConstatById(Long id) {

        return photoConstatRepository.findById(id).get();
    }

    public PhotoConstat addOrUpdatePhotoConstat(PhotoConstat photoConstat) {
        return photoConstatRepository.save(photoConstat);
    }

    public void deletePhotoConstat(Long id) {
        photoConstatRepository.deleteById(id);}
}
