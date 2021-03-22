package com.example.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class RequestDto 
{
	
	private String movie_name;
	private LocalDate release_date;
	private Double price;
	private int quantity;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public LocalDate getRelease_date() {
		return release_date;
	}
	@Override
	public String toString() {
		return "RequestDto [movie_name=" + movie_name + ", release_date=" + release_date + ", price=" + price + "]";
	}
	public Double getPrice() {
		return price;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public void setRelease_date(LocalDate release_date) {
		this.release_date = release_date;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
