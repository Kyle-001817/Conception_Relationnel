package com.nba.statistiqueNba.api.models;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "joueur")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_joueur;
    private String nomjoueur;
    private String prenomjoueur;
    private Date datenaissance;
    private double poids;
    private double taille;
    private int id_poste;

    public Joueur() {

    }

    public String getNomjoueur() {
        return nomjoueur;
    }

    public void setNomjoueur(String nomjoueur) {
        this.nomjoueur = nomjoueur;
    }

    public String getPrenomjoueur() {
        return prenomjoueur;
    }

    public void setPrenomjoueur(String prenomjoueur) {
        this.prenomjoueur = prenomjoueur;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public Integer getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(Integer id_joueur) {
        this.id_joueur = id_joueur;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public int getId_poste() {
        return id_poste;
    }

    public void setId_poste(int id_poste) {
        this.id_poste = id_poste;
    }

    public Joueur(String nomJoueur, String prenomJoueur, Date dateNaissance, double poids, double taille, int id_poste) {
        this.nomjoueur = nomJoueur;
        this.prenomjoueur = prenomJoueur;
        this.datenaissance = dateNaissance;
        this.poids = poids;
        this.taille = taille;
        this.id_poste = id_poste;
    }
}
