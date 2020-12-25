package com.backend.geo_monument.Http.Requests;

import javax.validation.constraints.NotEmpty;

public class AuthRequest {

    @NotEmpty(message = "Username is a required field.")
    private String username;
    @NotEmpty(message = "Password is a required field.")
    private String password;

    public AuthRequest() {
    }

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
