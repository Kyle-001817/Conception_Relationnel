package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.Temp_Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository_TempJoueur extends JpaRepository<Temp_Joueur, Integer> {
    public List<Temp_Joueur> findByIdJoueur(Integer id);
}
