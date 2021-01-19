package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "constats")
public class Constat extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titre;
    @NotEmpty
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date;
    @NotEmpty
    private String status_constat;

    @OneToMany(mappedBy="photo")
    private Set<PhotoConstat> photoConstat = new HashSet<>();
    @ManyToOne
    @JoinColumn(name="id_monument", nullable=false)
    private Monument monument;

    public Constat() {
    }

    public Constat(String titre, String description, Date date, String status_constat, Set<PhotoConstat> photoConstat, Monument monument) {
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.status_constat = status_constat;
        this.photoConstat = photoConstat;
        this.monument = monument;
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

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus_constat() {
        return status_constat;
    }

    public Set<PhotoConstat> getPhotoConstat() {
        return photoConstat;
    }

    public Monument getMonument() {
        return monument;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus_constat(String status_constat) {
        this.status_constat = status_constat;
    }

    public void setPhotoConstat(Set<PhotoConstat> photoConstat) {
        this.photoConstat = photoConstat;
    }

    public void setMonument(Monument monument) {
        this.monument = monument;
    }
}
