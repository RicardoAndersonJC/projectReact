package com.projetoReact.dto;

import entities.Movies;

public class MoviesDto {
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MoviesDto() {
    }

    public MoviesDto(Long id, String title, Double score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }


    public MoviesDto(Movies move) {
        id = move.getId();;
        title = move.getTitle();
        score = move.getScore();
        count = move.getCount();
        image = move.getImage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
