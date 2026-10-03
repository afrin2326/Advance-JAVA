package com.iostream.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="std_details")
public class Student 
{
	@Id
	
	@Column(name="std_id")
	private int id;
	
	@Column(name="std_name")
	private String name;
	
	@Column(name="std_rollno")
	private int rollno;
	
	@Column(name="std_city")
	private String city;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
