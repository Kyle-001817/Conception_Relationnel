package com.nba.statistiqueNba.services;

import com.nba.statistiqueNba.api.models.*;
import com.nba.statistiqueNba.api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Service_Joueur {
    @Autowired
    private Repository_Joueur joueurRepository;
    @Autowired
    private Repository_EquipeJoueur equipeJoueurRepository;
    @Autowired
    private Repository_TempJoueur tempJoueurRepository;
    @Autowired
    private Repository_Tir tirRepository;
    @Autowired
    private Repository_Rebond rebondRepository;
    @Autowired
    private Repository_Passe passeRepository;
    public List<Joueur> getAllJoueur() {
        return joueurRepository.findAll();
    }

    public Optional<Joueur> getJoueurById(int id) { return joueurRepository.findById(id); }

    public List<Joueur> getListJoueurByIdEquipe(int id) {
        List<Joueur> joueurs = new ArrayList<>();
        List<EquipeJoueur> ej = equipeJoueurRepository.findByIdEquipe(id);
        System.out.println(ej.size());
        for (int i = 0; i < ej.size(); i++) {
            Joueur j = getJoueurById(ej.get(i).getIdJoueur()).get();
            joueurs.add(j);
        }
        return joueurs;
    }

    public List<Temp_Joueur> getListTempJoueur(int id) {
        return tempJoueurRepository.findByIdJoueur(id);
    }

    public List<Tir> getListTirJoueur(int id) {
        return tirRepository.findByIdJoueur(id);
    }

    public List<Rebond> getListRebondJoueur(int id) {
        return rebondRepository.findByIdJoueur(id);
    }

    public List<Passe> getListPasseJoueur(int id) {
        return passeRepository.findByIdJoueur(id);
    }
}
