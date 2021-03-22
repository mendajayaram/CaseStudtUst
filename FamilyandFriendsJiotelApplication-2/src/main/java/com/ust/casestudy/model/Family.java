package com.ust.casestudy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//: Add Friend/Familymember phone number
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Family {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long aadharNo;
	private long phonenumber;

}
