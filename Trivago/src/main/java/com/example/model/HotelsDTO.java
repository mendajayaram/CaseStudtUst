package com.example.model;

import javax.persistence.Transient;

public class HotelsDTO {
	
	private int hotel_id;
	private String address;
	private String name;

	@Transient
	private String addroomlink;
	@Transient
	private String check_availability;

	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddroomlink() {
		return addroomlink;
	}
	public void setAddroomlink(String addroomlink) {
		this.addroomlink = addroomlink;
	}
	public String getCheck_availability() {
		return check_availability;
	}
	public void setCheck_availability(String check_availability) {
		this.check_availability = check_availability;
	}
	@Override
	public String toString() {
		return "Hotels [hotel_id=" + hotel_id + ", address=" + address + ", name=" + name + ", addroomlink=" + addroomlink
				+ ", check_availability=" + check_availability + "]";
	}

}
