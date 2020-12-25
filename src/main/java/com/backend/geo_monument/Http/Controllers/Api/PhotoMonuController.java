package com.backend.geo_monument.Http.Controllers.Api;


import com.backend.geo_monument.Models.PhotoMonu;
import com.backend.geo_monument.Services.PhotoMonuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monument_photos")
@CrossOrigin(origins = "*")
public class PhotoMonuController {

    @Autowired
    private PhotoMonuService photoMonuService;

    @GetMapping("/monument/{id}")
    public ResponseEntity<List<PhotoMonu>> index(@PathVariable Long id) {
        return new ResponseEntity<>(photoMonuService.ListPhotoMonument(id), HttpStatus.OK);
    }

    @PostMapping("/monument/{id}")
    public ResponseEntity<PhotoMonu> store(@RequestBody PhotoMonu photoMonu, @PathVariable Long id) {
        return new ResponseEntity<>(photoMonuService.addOrUpdatePhotoMonu(photoMonu, id), HttpStatus.OK);
    }

    @PutMapping("/monument/{id}")
    public ResponseEntity<PhotoMonu> update(@RequestBody PhotoMonu photoMonu, @PathVariable Long id) {
        return new ResponseEntity<>(photoMonuService.addOrUpdatePhotoMonu(photoMonu, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        photoMonuService.deletePhotoMonu(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }

}
