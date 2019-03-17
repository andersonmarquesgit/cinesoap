package com.cinesoap.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cinesoap.soap.entity.Film;
import com.cinesoap.soap.response.FilmResponse;
import com.cinesoap.soap.service.FilmService;

@Endpoint
public class FilmEndpoint {

	private static final String NAMESPACE_URI = "http://www.cinesoap.spring.integration.com/films";
	
	@Autowired
	private FilmService filmService;

	@PayloadRoot(localPart = "filmRequest", namespace = NAMESPACE_URI)
	@ResponsePayload
	public FilmResponse getFilms() {
		return buildResponse();
	}

	private FilmResponse buildResponse() {
		FilmResponse response = new FilmResponse();

		for (Film film : filmService.getFilms()) {
			response.getFilms().add(film);
		}

		return response;
	}
}
