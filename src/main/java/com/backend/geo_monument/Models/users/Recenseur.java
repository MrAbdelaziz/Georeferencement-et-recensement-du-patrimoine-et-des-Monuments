package com.backend.geo_monument.Models.users;

import com.backend.geo_monument.Enum.StatusUser;
import com.backend.geo_monument.Models.Region;
import com.backend.geo_monument.Models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@DiscriminatorValue("role_recenseur")
public class Recenseur extends User {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonIgnore
    private Region region;

    public Recenseur() {
    }

    public Recenseur(String name, String username, String email, String tel, String address, String password, StatusUser statusCpt, Region region) {
        super(name, username, email, tel, address, password, statusCpt);
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
