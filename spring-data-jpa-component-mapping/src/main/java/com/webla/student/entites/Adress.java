package com.webla.student.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	@Column(name = "streetaddress")
	private String streetAddress;
	private String city;
	@Column(name = "zipcode")
	private String zipCode;
	private String country;
	private String state;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
