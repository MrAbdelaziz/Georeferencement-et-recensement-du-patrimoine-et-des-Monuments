package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Models.CategoryMonu;
import com.backend.geo_monument.Services.CategoryMonuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monument_categories")
@CrossOrigin(origins = "*")
public class CategoryMonuController  {

    @Autowired
    private CategoryMonuService categoryMonuService;

    @GetMapping("")
    public ResponseEntity<List<CategoryMonu>> index() {
        return new ResponseEntity<>(categoryMonuService.ListCategoryMonu(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryMonu> show(@PathVariable Long id) {
        return new ResponseEntity<>(categoryMonuService.findCategoryMonuById(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<CategoryMonu> store(@RequestBody CategoryMonu categoryMonu) {
        return new ResponseEntity<>(categoryMonuService.addOrUpdateCategoryMonu(categoryMonu), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<CategoryMonu> update(@RequestBody CategoryMonu categoryMonu) {
        return new ResponseEntity<>(categoryMonuService.addOrUpdateCategoryMonu(categoryMonu), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        categoryMonuService.deleteCategoryMonu(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }

}
