package com.einfo.demoDataJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demoDataJpa.dao.Moviedao;
import com.einfo.demoDataJpa.model.Movie;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class JpaController {
	
	@Autowired
	Moviedao md;
	@RequestMapping("home")
	public ModelAndView gethome() {
		return new ModelAndView("home");
	}
	
		@RequestMapping("addmovie")
		public ModelAndView getaddmovie() {
			return new ModelAndView("addmovie");
		}
		
		@RequestMapping(value = "insertmovie", method= RequestMethod.POST)
		public ModelAndView insertmovie(HttpServletRequest req, @RequestParam("mname") String moviename, @RequestParam("lang") String Lang) {
			//int movieId = Integer.parseInt(req.getParameter("mid"));
			
			Movie m = new Movie(3, moviename,req.getParameter("director"),Lang);
			
			//UserDao
			md.save(m);
			
			System.out.println(m);
			return new ModelAndView("success");
		}
		@RequestMapping("viewmovies")
		public ModelAndView getviewmovie() {
			ModelAndView mv = new ModelAndView("viewallmovies");
			List<Movie> li = md.findAll();
			mv.addObject("movies",li);
			return mv;
		}
}
