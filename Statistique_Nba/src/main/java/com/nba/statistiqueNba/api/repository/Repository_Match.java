package com.nba.statistiqueNba.api.repository;

import com.nba.statistiqueNba.api.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository_Match extends JpaRepository<Match, Integer> {
    List<Match> findByIdequipe1OrIdequipe2(Integer id1, Integer id2);
}
