package com.einfo.demoDataJpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.einfo.demoDataJpa.model.Movie;

@Repository
public interface Moviedao extends JpaRepository<Movie, Integer>{
	@Query("select m from Movie m WHERE m.language= :Lang")
	List<Movie> findMoviebyLanguage(@Param("Lang") String Lang);
}
