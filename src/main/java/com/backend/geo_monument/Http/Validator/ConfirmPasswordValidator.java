package com.backend.geo_monument.Http.Validator;

import com.backend.geo_monument.Http.Requests.SignupRequest;
import com.backend.geo_monument.Models.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import org.springframework.validation.Validator;

@Component
public class ConfirmPasswordValidator implements Validator {

    @Override
    public boolean supports(Class<?> obj) {
        return User.class.equals(obj);
    }

    @Override
    public void validate(Object obj, Errors e) {
        SignupRequest user = (SignupRequest) obj;
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            e.rejectValue("confirmPassword", "Match", "confirm_password must match");
        }
    }
}