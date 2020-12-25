package com.backend.geo_monument.Http.Requests;

import com.backend.geo_monument.Enum.Roles;
import com.backend.geo_monument.Enum.StatusUser;
import com.backend.geo_monument.Models.Region;
import com.backend.geo_monument.Models.User;

public class SignupRequest extends User {

    private Roles role;
    private Region region;

    public SignupRequest() {}

    public SignupRequest(String name, String username, String email, String tel, String address, String password, StatusUser statusCpt, Roles role) {
        super(name, username, email, tel, address, password, statusCpt);
        this.role = role;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
