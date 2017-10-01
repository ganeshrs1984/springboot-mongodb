package com.tech.springbootmangodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

@Document	
public class Appartment {

	@Id
	String id;
	String name;
	String city;
	int rent;
	String state;
	String country;
	
	
	
	public Appartment(String id, String name, String city, int rent, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.rent = rent;
		this.state = state;
		this.country = country;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
