package com.backend.geo_monument.Models;

import com.backend.geo_monument.Models.users.PeriodeID;
import com.backend.geo_monument.Utils.Audit;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Periode extends Audit {
    @EmbeddedId
    private PeriodeID id;
    @ManyToOne
    @JoinColumn(name = "evenement_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Evenement evenement;
    @ManyToOne
    @JoinColumn(name = "monument_id", referencedColumnName = "id", insertable = false, updatable = false)
    private  Monument monument;

    public Periode() {
    }

    public Periode(Evenement evenement, Monument monument) {
        this.evenement = evenement;
        this.monument = monument;
    }
}
