package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "regions")
public class Region extends Audit {

    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String intitulé;

    public Region() {
    }

    public Region(@NotEmpty String intitulé) {
        this.intitulé = intitulé;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }
}
