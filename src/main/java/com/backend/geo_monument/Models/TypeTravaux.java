package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "constats")
public class TypeTravaux extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titre;
    @OneToMany(mappedBy="travaux")
    private Set<Travaux> travaux = new HashSet<>();

    public TypeTravaux() {
    }

    public TypeTravaux(String titre, Set<Travaux> travaux) {
        this.titre = titre;
        this.travaux = travaux;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public Set<Travaux> getTravaux() {
        return travaux;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setTravaux(Set<Travaux> travaux) {
        this.travaux = travaux;
    }
}
