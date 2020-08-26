package com.stockchart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserRequestModel {
	@JsonIgnore
	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private String mobileNumber;
	private Boolean admin;
	private Boolean confirmed;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
	public UserRequestModel(Integer userId, String userName, String password, String email, String mobileNumber,
			Boolean admin, Boolean confirmed) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.admin = admin;
		this.confirmed = confirmed;
	}
	public UserRequestModel() {
		super();
	}
}
