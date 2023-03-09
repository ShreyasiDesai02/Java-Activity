package com.einfo.demoDataJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfo.demoDataJpa.model.Movie;

@Repository
public interface Moviedao extends JpaRepository<Movie, Integer>{

}
