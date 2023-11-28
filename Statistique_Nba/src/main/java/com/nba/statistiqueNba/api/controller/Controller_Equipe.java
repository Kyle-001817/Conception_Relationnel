package com.nba.statistiqueNba.api.controller;

import com.nba.statistiqueNba.api.models.Joueur;
import com.nba.statistiqueNba.services.Service_Equipe;
import com.nba.statistiqueNba.services.Service_Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/nba/equipe")
@CrossOrigin
public class Controller_Equipe {
    @Autowired
    private Service_Joueur joueurService;

    @GetMapping("listejoueur/{id}")
    public List<Joueur> getListJoueurEquipe(@PathVariable("id") Integer id){
        return joueurService.getListJoueurByIdEquipe(id);
    }
}
