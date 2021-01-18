package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.Categorie;
import com.backend.geo_monument.Models.Evenement;
import com.backend.geo_monument.Services.CategorieService;
import com.backend.geo_monument.Services.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/evenements")
@CrossOrigin(origins = "*")
public class EvenementController {

    @Autowired
    private EvenementService evenementService;

    @GetMapping("")
    public ResponseEntity<List<Evenement>> index() {
        return new ResponseEntity<>(evenementService.ListEvenement(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evenement> show(@PathVariable Long id) {
        return new ResponseEntity<>(evenementService.findEvenementById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Evenement> store(@RequestBody Evenement evenement) {
        return new ResponseEntity<>(evenementService.addOrUpdateEvenement(evenement), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Evenement> update(@RequestBody Evenement evenement) {
        return new ResponseEntity<>(evenementService.addOrUpdateEvenement(evenement), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        evenementService.deleteEvenement(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
