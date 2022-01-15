package com.projetoReact.repositories;

import entities.Score;
import entities.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
