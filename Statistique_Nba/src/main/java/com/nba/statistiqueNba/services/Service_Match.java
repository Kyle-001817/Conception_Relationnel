package com.nba.statistiqueNba.services;

import com.nba.statistiqueNba.api.models.Match;
import com.nba.statistiqueNba.api.repository.Repository_Match;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service_Match {
    @Autowired
    private Repository_Match matchRepository;

    public List<Match> getAllMatch() {
        return matchRepository.findAll();
    }

    /*public List<Match> getMatchEquipe(int idequipe) {
        return matchRepository.findById_equipe1OrAndId_equipe2(idequipe);
    }*/
}
