package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.Evenement;
import com.backend.geo_monument.Models.Travaux;
import com.backend.geo_monument.Services.EvenementService;
import com.backend.geo_monument.Services.TravauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/travaux")
@CrossOrigin(origins = "*")
public class TravauxController {

    @Autowired
    private TravauxService travauxService;

    @GetMapping("")
    public ResponseEntity<List<Travaux>> index() {
        return new ResponseEntity<>(travauxService.ListTravaux(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Travaux> show(@PathVariable Long id) {
        return new ResponseEntity<>(travauxService.findTravauxById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Travaux> store(@RequestBody Travaux travaux) {
        return new ResponseEntity<>(travauxService.addOrUpdateTravaux(travaux), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Travaux> update(@RequestBody Travaux travaux) {
        return new ResponseEntity<>(travauxService.addOrUpdateTravaux(travaux), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        travauxService.deleteTravaux(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
