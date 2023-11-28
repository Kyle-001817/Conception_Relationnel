package com.nba.statistiqueNba.api.controller;

import com.nba.statistiqueNba.api.models.Equipe;
import com.nba.statistiqueNba.api.models.Joueur;
import com.nba.statistiqueNba.api.models.Statistique;
import com.nba.statistiqueNba.services.Service_Equipe;
import com.nba.statistiqueNba.services.Service_Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/nba/joueur")
@CrossOrigin
public class Controller_Joueur {
    @Autowired
    private Service_Joueur joueurService;
    @Autowired
    private Service_Equipe equipeService;

    @GetMapping
    public List<Joueur> getAllJoueur(){
        return joueurService.getAllJoueur();
    }

    @GetMapping("equipe/{id}")
    public Optional<Equipe> getEquipeJoueur(@PathVariable("id") Integer id){
        return equipeService.getEquipeJoueurById(id);
    }

    @GetMapping("allStat")
    public List<Statistique> getAllStat() {
        Statistique stat = new Statistique();
        return stat.getAllStat(joueurService,equipeService);
    }
}
