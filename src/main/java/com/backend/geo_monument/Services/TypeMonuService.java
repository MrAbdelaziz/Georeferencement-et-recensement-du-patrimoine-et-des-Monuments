package com.backend.geo_monument.Services;

import com.backend.geo_monument.Models.CategoryMonu;
import com.backend.geo_monument.Models.TypeMonu;
import com.backend.geo_monument.Repositories.CategoryMonuRepository;
import com.backend.geo_monument.Repositories.TypeMonuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeMonuService {

    @Autowired
    private TypeMonuRepository typeMonuRepository;

    public List<TypeMonu> ListTypesMonu() {
        return typeMonuRepository.findAll();
    }

    public TypeMonu findTypeMonuById(Long id) {
        return typeMonuRepository.findById(id).get();
    }

    public TypeMonu addOrUpdateTypeMonu(TypeMonu typeMonu) {
        return typeMonuRepository.save(typeMonu);
    }

    public void deleteTypeMonu(Long id) {
        typeMonuRepository.deleteById(id);
    }

}
