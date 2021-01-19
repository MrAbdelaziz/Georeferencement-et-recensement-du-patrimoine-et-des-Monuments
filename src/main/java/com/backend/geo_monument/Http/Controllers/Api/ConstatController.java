package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.Categorie;
import com.backend.geo_monument.Models.Constat;
import com.backend.geo_monument.Services.ConstatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/constats")
@CrossOrigin(origins = "*")
public class ConstatController {

    @Autowired
    private ConstatService categorieService;

    @GetMapping("")
    public ResponseEntity<List<Constat>> index() {
        return new ResponseEntity<>(categorieService.ListConstat(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Constat> show(@PathVariable Long id) {
        return new ResponseEntity<>(categorieService.findConstatById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Constat> store(@RequestBody Constat constat){
        return new ResponseEntity<>(categorieService.addOrUpdateConstat(constat), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Constat> update(@RequestBody Constat constat) {
        return new ResponseEntity<>(categorieService.addOrUpdateConstat(constat), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        categorieService.deleteConstat(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
