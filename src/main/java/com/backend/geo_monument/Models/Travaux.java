package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import java.util.Date;

@Entity
@Table(name = "travaux")
public class Travaux extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titre;
    @Temporal(TemporalType.DATE)
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    private Date date_fin;
    @ManyToOne
    @JoinColumn(name="id_monument", nullable=false)
    private Monument monument;
    @ManyToOne
    @JoinColumn(name="id_type", nullable=false)
    private TypeTravaux typeTravaux;

    public Travaux() {
    }

    public Travaux(String titre, Date date_debut, Date date_fin, Monument monument, TypeTravaux typeTravaux) {
        this.titre = titre;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.monument = monument;
        this.typeTravaux = typeTravaux;
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

    public Date getDate_debut() {
        return date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public Monument getMonument() {
        return monument;
    }

    public TypeTravaux getTypeTravaux() {
        return typeTravaux;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public void setMonument(Monument monument) {
        this.monument = monument;
    }

    public void setTypeTravaux(TypeTravaux typeTravaux) {
        this.typeTravaux = typeTravaux;
    }
}
