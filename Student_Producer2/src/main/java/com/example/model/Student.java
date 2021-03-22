package com.example.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;




public class Student 
{

private int student_id;
private String student_name;
private String address;
private String school_name;
public int getStudent_id() {
	return student_id;
}
public String getStudent_name() {
	return student_name;
}
public String getAddress() {
	return address;
}
public String getSchool_name() {
	return school_name;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public void setAddress(String address) {
	this.address = address;
}
public void setSchool_name(String school_name) {
	this.school_name = school_name;
}
@Override
public String toString() {
	return "Student [student_id=" + student_id + ", student_name=" + student_name + ", address=" + address
			+ ", school_name=" + school_name + "]";
}


}
