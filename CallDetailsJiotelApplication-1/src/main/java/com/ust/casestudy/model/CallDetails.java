package com.ust.casestudy.model;



import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*Call Details : Gives call details of a given customer such as calledBy, calledTo, 
date and duration of the calls*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CallDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String calledby;
	private String calledto;
	//@Temporal(TemporalType.DATE)
	private Date date;
	//@Temporal(TemporalType.TIME)
	private Time duration;

}
