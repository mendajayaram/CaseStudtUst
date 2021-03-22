package com.example.model;

//@Entity
public class LoginUser {
	
	//private int id;
	private String name;
	private String email;
	private String role;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getRole() {
		return role;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "LoginUser [name=" + name + ", email=" + email + ", role=" + role + "]";
	}

}
