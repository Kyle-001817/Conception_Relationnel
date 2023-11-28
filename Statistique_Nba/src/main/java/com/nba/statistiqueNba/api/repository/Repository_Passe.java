package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.Passe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository_Passe extends JpaRepository<Passe, Integer> {
    List<Passe> findByIdJoueur(int id);
}
