package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_match;
    private Integer id_saison;
    private Timestamp date_match;
    @Column(name = "id_equipe1")
    private Integer idequipe1;
    @Column(name = "id_equipe2")
    private Integer idequipe2;

    public Integer getId_match() {
        return id_match;
    }

    public void setId_match(Integer id_match) {
        this.id_match = id_match;
    }

    public Integer getId_saison() {
        return id_saison;
    }

    public void setId_saison(Integer id_saison) {
        this.id_saison = id_saison;
    }

    public Timestamp getDate_match() {
        return date_match;
    }

    public void setDate_match(Timestamp date_match) {
        this.date_match = date_match;
    }

    public Integer getIdequipe1() {
        return idequipe1;
    }

    public void setIdequipe1(Integer id_equipe1) {
        this.idequipe1 = id_equipe1;
    }

    public Integer getIdequipe2() {
        return idequipe2;
    }

    public void setIdequipe2(Integer id_equipe2) {
        this.idequipe2 = id_equipe2;
    }
}
