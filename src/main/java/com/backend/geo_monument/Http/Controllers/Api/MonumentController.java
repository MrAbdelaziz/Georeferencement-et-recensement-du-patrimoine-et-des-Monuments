package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.Monument;
import com.backend.geo_monument.Services.MonumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/monuments")
@CrossOrigin(origins = "*")
public class MonumentController {

    @Autowired
    private MonumentService monumentService;

    @GetMapping("")
    public ResponseEntity<ArrayList<Monument>> index() {
        return new ResponseEntity<>(monumentService.ListMonuments(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monument> show(@PathVariable Long id) {
        return new ResponseEntity<>(monumentService.findMonumentById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Monument> store(@RequestBody Monument monument) {
        return new ResponseEntity<>(monumentService.addMonument(monument), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Monument> update(@RequestBody Monument monument) {
        return new ResponseEntity<>(monumentService.updateMonument(monument), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        monumentService.deleteMonument(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }

}
