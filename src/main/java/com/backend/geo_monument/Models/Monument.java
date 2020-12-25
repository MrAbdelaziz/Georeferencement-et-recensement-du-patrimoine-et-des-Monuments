package com.backend.geo_monument.Models;

import com.backend.geo_monument.Enum.StatusMonu;
import com.backend.geo_monument.Utils.Audit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "monuments")
public class Monument extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String dateCreatetion;
    private String adresse;
    private StatusMonu status;
    private Long altitude;
    private Long longitude;
    private String dateValidation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CategoryMonu categoryMonu;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private TypeMonu typeMonu;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "region_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Region region;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "monument")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<PhotoMonu> photoMonus = new HashSet<>();

    public Monument() {
    }

    public Monument(Long id, String name, String dateCreatetion, String adresse, Long altitude, Long longitude, String dateValidation, CategoryMonu categoryMonu, TypeMonu typeMonu) {
        this.id = id;
        this.name = name;
        this.dateCreatetion = dateCreatetion;
        this.longitude = longitude;
        this.altitude = altitude;
        this.adresse = adresse;
        this.dateValidation = dateValidation;
        this.categoryMonu = categoryMonu;
        this.typeMonu = typeMonu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreatetion() {
        return dateCreatetion;
    }

    public void setDateCreatetion(String dateCreatetion) {
        this.dateCreatetion = dateCreatetion;
    }

    public StatusMonu getStatus() {
        return status;
    }

    public void setStatus(StatusMonu status) {
        this.status = status;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public String getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public CategoryMonu getCategoryMonu() {
        return categoryMonu;
    }

    public void setCategoryMonu(CategoryMonu categoryMonu) {
        this.categoryMonu = categoryMonu;
    }

    public TypeMonu getTypeMonu() {
        return typeMonu;
    }

    public void setTypeMonu(TypeMonu typeMonu) {
        this.typeMonu = typeMonu;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getAltitude() {
        return altitude;
    }

    public void setAltitude(Long altitude) {
        this.altitude = altitude;
    }

    public Set<PhotoMonu> getPhotoMonus() {
        return photoMonus;
    }

    public void setPhotoMonus(Set<PhotoMonu> photoMonus) {
        this.photoMonus = photoMonus;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
