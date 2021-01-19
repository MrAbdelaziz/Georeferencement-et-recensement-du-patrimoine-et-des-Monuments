package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.TypeEvenement;
import com.backend.geo_monument.Services.TypeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typesEvenement")
@CrossOrigin(origins = "*")
public class TypeEventController {
    @Autowired
    private TypeEventService typeEventService;

    @GetMapping("")
    public ResponseEntity<List<TypeEvenement>> index() {
        return new ResponseEntity<>(typeEventService.ListTypeEvenement(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeEvenement> show(@PathVariable Long id) {
        return new ResponseEntity<>(typeEventService.findTypeEvenementById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<TypeEvenement> store(@RequestBody TypeEvenement typeEvenement) {
        return new ResponseEntity<>(typeEventService.addOrUpdateTypeEvenement(typeEvenement), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<TypeEvenement> update(@RequestBody TypeEvenement typeEvenement) {
        return new ResponseEntity<>(typeEventService.addOrUpdateTypeEvenement(typeEvenement), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        typeEventService.deleteTypeEvenement(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
