package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Categorie extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titre;
    @OneToMany
    @JoinColumn(mappedBy="evenement")
    private Set<Evenement> evenement = new HashSet<>();

    public Categorie() {
    }

    public Categorie(String titre, Set<Evenement> evenement) {
        this.titre = titre;
        this.evenement = evenement;
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

    public Set<Evenement> getEvenement() {
        return evenement;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setEvenement(Set<Evenement> evenement) {
        this.evenement = evenement;
    }
}
