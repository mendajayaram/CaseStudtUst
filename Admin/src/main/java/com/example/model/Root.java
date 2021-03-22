package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

@Entity
@Table(name = "root_table")
public class Root {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)	
	private int  root_id;
	private String train;
	private int train_no;
	
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "source field should contain only alphabets")
	@NotNull
	@NotBlank(message="source should not be  empty")
	//@NotBlank(message="${source.not.empty}")
	private String source;
	
	
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "destination field should contain only alphabets")
	@NotNull
	@NotBlank(message="destination should not be  empty")
	//@NotBlank(message="${destination.not.empty}")
	private String destination;
	
	
	public int getRoot_id() {
		return root_id;
	}
	public void setRoot_id(int root_id) {
		this.root_id = root_id;
	}
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Root [root_id=" + root_id + ", train=" + train + ", train_no=" + train_no + ", source=" + source
				+ ", destination=" + destination + "]";
	}
	
	

}
