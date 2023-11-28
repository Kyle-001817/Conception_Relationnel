package com.nba.statistiqueNba.api.models;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "temps_joueur_match")
public class Temp_Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_joueur")
    private Integer idJoueur;
    @Column(name = "id_match")
    private Integer idMatch;
    @Column(name = "id_quart_temps")
    private Integer idQuartTemps;
    @Column(name = "chrono_entre")
    private Time chronoEntre;
    @Column(name = "chrono_sortie")
    private Time chronoSortie;

    public Temp_Joueur() {

    }

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

    public Time getChronoEntre() {
        return chronoEntre;
    }

    public void setChronoEntre(Time chronoEntre) {
        this.chronoEntre = chronoEntre;
    }

    public Time getChronoSortie() {
        return chronoSortie;
    }

    public void setChronoSortie(Time chronoSortie) {
        this.chronoSortie = chronoSortie;
    }
}
