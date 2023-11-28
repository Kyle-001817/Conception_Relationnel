package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_Equipe extends JpaRepository<Equipe, Integer> {
}
