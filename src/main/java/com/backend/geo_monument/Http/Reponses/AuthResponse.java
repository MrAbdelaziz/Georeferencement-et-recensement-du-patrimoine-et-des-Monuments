package com.backend.geo_monument.Http.Reponses;

public class AuthResponse {

    private Boolean succes;
    private String token;

    public AuthResponse() {
    }

    public AuthResponse(String token, Boolean succes) {
        this.token = token;
        this.succes = succes;
    }

    public Boolean isSucces() {
        return this.succes;
    }

    public Boolean getSucces() {
        return this.succes;
    }

    public void setSucces(Boolean succes) {
        this.succes = succes;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "{" + " succes='" + isSucces() + "'" + ", token='" + getToken() + "'" + "}";
    }

}