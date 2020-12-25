package com.backend.geo_monument.Models.users;

import com.backend.geo_monument.Enum.StatusUser;
import com.backend.geo_monument.Models.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("role_minister")
public class Minister extends User {

    public Minister() {
    }

    public Minister(String name, String username, String email, String tel, String address, String password, StatusUser statusCpt) {
        super(name, username, email, tel, address, password, statusCpt);
    }
}
