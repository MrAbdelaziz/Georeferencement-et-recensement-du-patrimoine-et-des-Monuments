package com.backend.geo_monument.Http.Controllers.Api;


import com.backend.geo_monument.Models.TypeMonu;
import com.backend.geo_monument.Services.TypeMonuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/monument_types")
@CrossOrigin(origins = "*")
public class TypeMonuController {

    @Autowired
    private TypeMonuService typeMonuService;

    @GetMapping("")
    public ResponseEntity<List<TypeMonu>> index() {
        return new ResponseEntity<>(typeMonuService.ListTypesMonu(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeMonu> show(@PathVariable Long id) {
        return new ResponseEntity<>(typeMonuService.findTypeMonuById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<TypeMonu> store(@RequestBody TypeMonu typeMonu) {
        return new ResponseEntity<>(typeMonuService.addOrUpdateTypeMonu(typeMonu), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<TypeMonu> update(@RequestBody TypeMonu typeMonu) {
        return new ResponseEntity<>(typeMonuService.addOrUpdateTypeMonu(typeMonu), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        typeMonuService.deleteTypeMonu(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }

}
