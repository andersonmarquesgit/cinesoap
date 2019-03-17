package com.cinesoap.soap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinesoap.soap.entity.Film;
import com.cinesoap.soap.repository.FilmRepository;
import com.cinesoap.soap.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepository;
	
	@Override
	public List<Film> getFilms() {
		return filmRepository.findAll();
	}

}
