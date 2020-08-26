package com.stockchart.entity;

public class Address {
	private String street;
	private String locality;
	private String state;
	private String country;
	private String zipCode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Address(String street, String locality, String state, String country, String zipCode) {
		super();
		this.street = street;
		this.locality = locality;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
	}
}
