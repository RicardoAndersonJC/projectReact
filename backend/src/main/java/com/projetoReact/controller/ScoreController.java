package com.projetoReact.controller;


import com.projetoReact.dto.MoviesDto;
import com.projetoReact.dto.ScoreDto;
import com.projetoReact.service.MovieService;
import com.projetoReact.service.ScoreService;
import entities.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
  @Autowired
  private ScoreService scoreService;
    @PutMapping
    public MoviesDto saveScore(@RequestBody  ScoreDto scoreDto){
    MoviesDto moviesDto = scoreService.saveScore(scoreDto);
    return moviesDto;
  }
}
