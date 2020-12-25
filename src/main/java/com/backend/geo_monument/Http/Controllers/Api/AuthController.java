package com.backend.geo_monument.Http.Controllers.Api;

import com.backend.geo_monument.Http.Reponses.AuthResponse;
import com.backend.geo_monument.Http.Requests.AuthRequest;
import com.backend.geo_monument.Http.Requests.SignupRequest;
import com.backend.geo_monument.Http.Validator.ConfirmPasswordValidator;
import com.backend.geo_monument.Models.User;
import com.backend.geo_monument.Models.users.Recenseur;
import com.backend.geo_monument.Services.AuthService;
import com.backend.geo_monument.Exceptions.ArgumentNotValidExeption;
import com.backend.geo_monument.Utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private ArgumentNotValidExeption argumentNotValidExeption;

    @Autowired
    private ConfirmPasswordValidator confirmPasswordValidator;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody AuthRequest user, BindingResult r) throws Exception {

        // * 1- VALIDATE THE REQUEST ARGUMENTS
        if (r.hasErrors()) {
            return argumentNotValidExeption.handleValidationExceptions(r);
        }

        // * 2- CHECK THE USER AUTHENTICATE THE USER IN
        Authentication authentication = authService.authenticate(user.getUsername(), user.getPassword());

        // * 3- PUT THE AUTHENTICATION OBJECT IN THE CONTEXT
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // * 4- MAKE THE TOKEN
        String token = jwtTokenUtil.generateToken(authentication);

        // * 5- RETURN THE TOKEN
        return new ResponseEntity<AuthResponse>(new AuthResponse(token, true), HttpStatus.CREATED);

    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Valid @RequestBody SignupRequest user, BindingResult r) throws Exception {
        // * 1 - CHECK IF THE PASSWORD MATCH
        confirmPasswordValidator.validate(user, r);

        // * 2- VALIDATE THE REQUEST ARGUMENTS
        if (r.hasErrors()) {
            return argumentNotValidExeption.handleValidationExceptions(r);
        }

        return new ResponseEntity<>(authService.create(user), HttpStatus.CREATED);
    }

}
