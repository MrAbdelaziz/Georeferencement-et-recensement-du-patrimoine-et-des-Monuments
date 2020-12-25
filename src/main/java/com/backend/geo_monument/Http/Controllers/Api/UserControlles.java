package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Http.Requests.SignupRequest;
import com.backend.geo_monument.Models.TypeMonu;
import com.backend.geo_monument.Models.User;
import com.backend.geo_monument.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserControlles {

    @Autowired
    private AuthService authService;

    @GetMapping("")
    public ResponseEntity<List<User>> index() {
        return new ResponseEntity<>(authService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> show(@PathVariable Long id) {
        return new ResponseEntity<>(authService.loadUserById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        authService.deleteUser(id);
        return new ResponseEntity<>(true , HttpStatus.OK);
    }

}
