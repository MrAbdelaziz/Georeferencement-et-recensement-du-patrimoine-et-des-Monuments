package com.backend.geo_monument.Models.users;

import java.io.Serializable;
import java.util.Date;

public class PeriodeID implements Serializable {
    private int evenement;
    private int monument;
    private Date date;

    public PeriodeID() {
    }

    public PeriodeID(int evenement, int monument, Date date) {
        this.evenement = evenement;
        this.monument = monument;
        this.date = date;
    }
}
