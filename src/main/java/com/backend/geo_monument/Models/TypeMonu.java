package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import javax.persistence.*;

@Entity
@Table(name = "monument_types")
public class TypeMonu extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;

    public TypeMonu() {
    }

    public TypeMonu(String libelle) {
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
