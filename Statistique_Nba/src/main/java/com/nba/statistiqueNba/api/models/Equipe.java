package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "equipe")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_equipe;

    @Column(name = "nomequipe")
    private String nomEquipe;

    public Equipe() {

    }

    public Integer getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(Integer id_equipe) {
        this.id_equipe = id_equipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }
}
