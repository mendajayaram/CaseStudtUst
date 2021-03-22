package com.example.dto;

import java.time.LocalDate;

import lombok.Data;


public class ResponeDto 
{

	private String movie_name;
	private String status;
	private LocalDate release_date;
	private LocalDate booking_date;
	private Double price;
	private int quantity;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(LocalDate booking_date) {
		this.booking_date = booking_date;
	}
	
	public String getMovie_name() {
		return movie_name;
	}
	public LocalDate getRelease_date() {
		return release_date;
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
	@Override
	public String toString() {
		return "ResponeDto [movie_name=" + movie_name + ", status=" + status + ", release_date=" + release_date
				+ ", booking_date=" + booking_date + ", price=" + price + "]";
	}
	
	
}
