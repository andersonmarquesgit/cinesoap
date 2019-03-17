package com.cinesoap.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinesoap.soap.entity.Film;

public interface FilmRepository extends JpaRepository<Film, String> {

}
