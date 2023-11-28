package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.Rebond;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository_Rebond extends JpaRepository<Rebond, Integer> {
    public List<Rebond> findByIdJoueur(Integer id);
}
