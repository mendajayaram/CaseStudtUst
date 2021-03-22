package com.example.model;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Ticket 
{
@Id
@GeneratedValue
private int id;
private String movie_name;
private double price;
private LocalDate release_date;

//private int quantity;

//public int getQuantity() {
//	return quantity;
//}
//public void setQuantity(int quantity) {
//	this.quantity = quantity;
//}
public int getId() {
	return id;
}
public String getMovie_name() {
	return movie_name;
}
public double getPrice() {
	return price;
}
public LocalDate getRelease_date() {
	return release_date;
}
public void setId(int id) {
	this.id = id;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}
public void setPrice(double price) {
	this.price = price;
}
public void setRelease_date(LocalDate release_date) {
	this.release_date = release_date;
}
}
