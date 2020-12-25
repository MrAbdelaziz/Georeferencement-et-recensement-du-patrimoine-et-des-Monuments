package com.backend.geo_monument.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@Component
public class ArgumentNotValidExeption {

    public ResponseEntity<?> handleValidationExceptions(BindingResult r) {

        HashMap<String, String> errors = new HashMap<>();

        if (r.hasErrors()) {
            r.getAllErrors().forEach(er -> {
                String fieldName = ((FieldError) er).getField();
                String messageError = er.getDefaultMessage();

                errors.put(fieldName, messageError);
            });

            return new ResponseEntity<Map<String, String>>(errors, HttpStatus.BAD_REQUEST);
        }

        return null;
    }

}
