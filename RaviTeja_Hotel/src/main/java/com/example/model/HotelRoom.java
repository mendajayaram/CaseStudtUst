package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RaviTeja_hotel")
public class HotelRoom 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int room_id;
private String room_status;
private String description;
public int getRoom_id() {
	return room_id;
}
public void setRoom_id(int room_id) {
	this.room_id = room_id;
}
public String getRoom_status() {
	return room_status;
}
public void setRoom_status(String room_status) {
	this.room_status = room_status;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "HotelRoom [room_id=" + room_id + ", room_status=" + room_status + ", description=" + description + "]";
}


}
