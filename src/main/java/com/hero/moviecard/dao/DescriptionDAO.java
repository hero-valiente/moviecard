package com.hero.moviecard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hero.moviecard.model.Description;

public interface DescriptionDAO extends JpaRepository<Description, Long>{

}
