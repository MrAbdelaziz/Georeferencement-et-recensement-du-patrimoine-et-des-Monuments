package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.Categorie;
import com.backend.geo_monument.Services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("")
    public ResponseEntity<List<Categorie>> index() {
        return new ResponseEntity<>(categorieService.ListCategorie(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> show(@PathVariable Long id) {
        return new ResponseEntity<>(categorieService.findCategorieById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Categorie> store(@RequestBody Categorie categorie) {
        return new ResponseEntity<>(categorieService.addOrUpdateCategorie(categorie), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Categorie> update(@RequestBody Categorie categorie) {
        return new ResponseEntity<>(categorieService.addOrUpdateCategorie(categorie), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        categorieService.deleteCategorie(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }
}
