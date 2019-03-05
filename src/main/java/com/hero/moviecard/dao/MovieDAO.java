package com.hero.moviecard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hero.moviecard.model.Movie;

public interface MovieDAO extends JpaRepository<Movie, Long>{

}
