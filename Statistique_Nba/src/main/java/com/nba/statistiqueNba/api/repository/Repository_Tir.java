package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.Tir;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository_Tir extends JpaRepository<Tir, Integer> {
    public List<Tir> findByIdJoueur(Integer id);
}
