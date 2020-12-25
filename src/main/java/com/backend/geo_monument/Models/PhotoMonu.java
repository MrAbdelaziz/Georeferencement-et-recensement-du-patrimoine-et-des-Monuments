package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "mounument_photos")
public class PhotoMonu extends Audit {

    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monument_id")
    @JsonIgnore
    private Monument monument;

    public PhotoMonu() {
    }

    public PhotoMonu(@NotEmpty String url, Monument monument) {
        this.url = url;
        this.monument = monument;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Monument getMonument() {
        return monument;
    }

    public void setMonument(Monument monument) {
        this.monument = monument;
    }
}
