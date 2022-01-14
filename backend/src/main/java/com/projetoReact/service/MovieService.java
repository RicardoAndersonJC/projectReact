package com.projetoReact.service;

import com.projetoReact.dto.MoviesDto;
import com.projetoReact.repositories.MovieRepository;
import entities.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MoviesDto> findAll(Pageable pageable){
     Page<Movies> result = movieRepository.findAll(pageable);
      Page<MoviesDto> page = result.map(x -> new MoviesDto(x));
      return page;
    }
}
