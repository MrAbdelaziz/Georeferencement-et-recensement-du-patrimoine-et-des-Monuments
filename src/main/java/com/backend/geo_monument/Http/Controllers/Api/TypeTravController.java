package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.Evenement;
import com.backend.geo_monument.Models.TypeTravaux;
import com.backend.geo_monument.Services.EvenementService;
import com.backend.geo_monument.Services.TypeTravService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeTravaux")
@CrossOrigin(origins = "*")
public class TypeTravController {
    @Autowired
    private TypeTravService typeTravService;

    @GetMapping("")
    public ResponseEntity<List<TypeTravaux>> index() {
        return new ResponseEntity<>(typeTravService.ListTypeTravaux(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeTravaux> show(@PathVariable Long id) {
        return new ResponseEntity<>(typeTravService.findTypeTravauxById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<TypeTravaux> store(@RequestBody TypeTravaux typeTravaux) {
        return new ResponseEntity<>(typeTravService.addOrUpdateTypeTravaux(typeTravaux), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<TypeTravaux> update(@RequestBody TypeTravaux typeTravaux) {
        return new ResponseEntity<>(typeTravService.addOrUpdateTypeTravaux(typeTravaux), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        typeTravService.deleteTypeTravaux(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
