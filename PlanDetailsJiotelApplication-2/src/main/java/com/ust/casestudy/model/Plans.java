package com.ust.casestudy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Gives details about other available plans
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String details;
	private double amount;
	private String available;
	private long phonenumber;

}
