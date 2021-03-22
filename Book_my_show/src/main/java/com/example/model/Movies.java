package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="movies_table")
public class Movies 
{
	@Id
	@GeneratedValue
private int movie_id;
private String movie_name;
	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name + "]";
	}
	public int getMovie_id() {
		return movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
}
