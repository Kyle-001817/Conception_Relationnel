package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "quart_temps")
public class Quart_temps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_quart_temps;
    private String nom;
    private Integer duree;

    public Integer getId_quart_temps() {
        return id_quart_temps;
    }

    public void setId_quart_temps(Integer id_quart_temps) {
        this.id_quart_temps = id_quart_temps;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }
}
