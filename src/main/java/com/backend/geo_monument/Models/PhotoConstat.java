package com.backend.geo_monument.Models;

import com.backend.geo_monument.Utils.Audit;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "constats")
public class PhotoConstat extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String titre;
    @NotEmpty
    private Date date;
    @ManyToOne
    @JoinColumn(name="id_constat", nullable=false)
    private Constat constat;

    public PhotoConstat() {
    }

    public PhotoConstat(String titre, Date date, Constat constat) {
        this.titre = titre;
        this.date = date;
        this.constat = constat;
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

    public Date getDate() {
        return date;
    }

    public Constat getConstat() {
        return constat;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setConstat(Constat constat) {
        this.constat = constat;
    }
}
