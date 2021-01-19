package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "evenements")
public class Evenement extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titre;
    @ManyToOne
    @JoinColumn(name="id_categorie", nullable=false)
    private Categorie categorie;
    @ManyToOne
    @JoinColumn(name="id_type", nullable=false)
    private TypeEvenement typeEvenement;
    @OneToMany(mappedBy = "evenement", fetch = FetchType.LAZY)
    private List<Periode> periodes;

    public Evenement() {
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

    public Categorie getCategorie() {
        return categorie;
    }

    public TypeEvenement getTypeEvenement() {
        return typeEvenement;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setTypeEvenement(TypeEvenement typeEvenement) {
        this.typeEvenement = typeEvenement;
    }
}
