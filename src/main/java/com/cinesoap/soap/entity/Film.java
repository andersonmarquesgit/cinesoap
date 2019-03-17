package com.cinesoap.soap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_films")
@Getter
@Setter
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	public String title;
	
	@Column(name="summary", length=2000)
	public String summary;
	
	@Column(name = "movie_theater")
	public String movieTheater;
		
	public String schedule;
	
}
