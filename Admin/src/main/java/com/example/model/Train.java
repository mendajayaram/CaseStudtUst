package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train_table")
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int train_id;
	private String name;
	private String  details;
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Train [train_id=" + train_id + ", name=" + name + ", details=" + details + "]";
	}
	
	
	

}
