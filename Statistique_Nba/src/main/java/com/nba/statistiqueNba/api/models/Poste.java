package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "poste")
public class Poste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_poste;
    private String nomPoste;

    public Integer getId_poste() {
        return id_poste;
    }

    public void setId_poste(Integer id_poste) {
        this.id_poste = id_poste;
    }

    public String getNomPoste() {
        return nomPoste;
    }

    public void setNomPoste(String nomPoste) {
        this.nomPoste = nomPoste;
    }
}
