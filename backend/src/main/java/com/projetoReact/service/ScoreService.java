package com.projetoReact.service;

import com.projetoReact.dto.MoviesDto;
import com.projetoReact.dto.ScoreDto;
import com.projetoReact.repositories.MovieRepository;
import com.projetoReact.repositories.ScoreRepository;
import com.projetoReact.repositories.UserRepository;
import entities.Movies;
import entities.Score;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {
    @Autowired
    private  ScoreRepository scoreRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;
    @Transactional
    public MoviesDto saveScore(ScoreDto scoreDto){
      User user = userRepository.findByEmail(scoreDto.getEmail());
      if (user == null){
          user = new User();
          user.setEmail(scoreDto.getEmail());
          user = userRepository.saveAndFlush(user);
      }
      Movies movies = movieRepository.findById(scoreDto.getMovieID()).get();

        Score score = new Score();
        score.setMovie(movies);
        score.setUser(user);
        score.setValue(scoreDto.getScore());
        score = scoreRepository.saveAndFlush(score);
    double sum = 0.0;
       for (Score s : movies.getScores()){
          sum = sum + s.getValue();
       }
    double avg = sum / movies.getScores().size();
    movies.setScore(avg);
    movies.setCount(movies.getScores().size());
    movies = movieRepository.save(movies);
    return new MoviesDto(movies);
}




}
