package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.EquipeJoueur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository_EquipeJoueur extends JpaRepository<EquipeJoueur, Integer> {
    List<EquipeJoueur> findByIdEquipe(Integer idEquipe);
    EquipeJoueur findByIdJoueur(Integer idjoueur);
}
