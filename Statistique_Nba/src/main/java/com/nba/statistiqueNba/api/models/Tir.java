package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "tir_match")
public class Tir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_joueur")
    private Integer idJoueur;
    @Column(name = "id_match")
    private Integer idMatch;
    @Column(name = "id_quart_temps")
    private Integer idQuartTemps;
    private Integer valeur;
    private Integer etat;
    private Time chrono;

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getIdQuartTemps() {
        return idQuartTemps;
    }

    public void setIdQuartTemps(Integer idQuartTemps) {
        this.idQuartTemps = idQuartTemps;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Time getChrono() {
        return chrono;
    }

    public void setChrono(Time chrono) {
        this.chrono = chrono;
    }
}
