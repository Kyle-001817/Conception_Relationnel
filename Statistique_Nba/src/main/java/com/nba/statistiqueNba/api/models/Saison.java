package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "saison")
public class Saison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_saison;
    private Date dateDebut;
    private Date dateFin;

    public Integer getId_saison() {
        return id_saison;
    }

    public void setId_saison(Integer id_saison) {
        this.id_saison = id_saison;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
