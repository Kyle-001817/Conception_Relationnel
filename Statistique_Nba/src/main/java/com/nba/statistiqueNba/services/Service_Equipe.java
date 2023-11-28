package com.nba.statistiqueNba.services;

import com.nba.statistiqueNba.api.models.Equipe;
import com.nba.statistiqueNba.api.models.EquipeJoueur;
import com.nba.statistiqueNba.api.models.Joueur;
import com.nba.statistiqueNba.api.repository.Repository_Equipe;
import com.nba.statistiqueNba.api.repository.Repository_EquipeJoueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Service_Equipe {
    @Autowired
    private Repository_Equipe equipeRepository;
    @Autowired
    private Repository_EquipeJoueur equipeJoueurRepository;

    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }

    public Optional<Equipe> getEquipeById(int id) { return equipeRepository.findById(id); }

    public Optional<Equipe> getEquipeJoueurById(int idjoueur) {
        EquipeJoueur ej = equipeJoueurRepository.findByIdJoueur(idjoueur);
        Optional<Equipe> eq = getEquipeById(ej.getIdEquipe());
        return eq;
    }
}
