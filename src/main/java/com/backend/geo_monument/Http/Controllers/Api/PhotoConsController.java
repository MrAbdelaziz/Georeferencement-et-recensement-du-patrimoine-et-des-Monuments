package com.backend.geo_monument.Http.Controllers.Api;
import com.backend.geo_monument.Models.PhotoConstat;
import com.backend.geo_monument.Services.PhotoConsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/photoConstats")
@CrossOrigin(origins = "*")
public class PhotoConsController {
    @Autowired
    private PhotoConsService photoConsService;

    @GetMapping("")
    public ResponseEntity<List<PhotoConstat>> index() {
        return new ResponseEntity<>(photoConsService.ListPhotoConstat(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhotoConstat> show(@PathVariable Long id) {
        return new ResponseEntity<>(photoConsService.findPhotoConstatById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<PhotoConstat> store(@RequestBody PhotoConstat photoConstat) {
        return new ResponseEntity<>(photoConsService.addOrUpdatePhotoConstat(photoConstat), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<PhotoConstat> update(@RequestBody PhotoConstat photoConstat) {
        return new ResponseEntity<>(photoConsService.addOrUpdatePhotoConstat(photoConstat), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        photoConsService.deletePhotoConstat(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
