package com.nba.statistiqueNba.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "equipe_joueur")
public class EquipeJoueur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_joueur")
    private Integer idJoueur;

    @Column(name = "id_equipe")
    private Integer idEquipe;

    @Column(name = "date_contrat", nullable = false)
    private Date dateContrat;

    @Column(name = "duree")
    private Integer duree;

    public EquipeJoueur() {
        // Required default constructor
    }

    public EquipeJoueur(Integer idJoueur, Integer idEquipe, Date dateContrat, Integer duree) {
        this.idJoueur = idJoueur;
        this.idEquipe = idEquipe;
        this.dateContrat = dateContrat;
        this.duree = duree;
    }

    // Getters and setters for the fields

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }
}
