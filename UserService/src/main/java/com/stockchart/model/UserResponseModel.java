package com.stockchart.model;

public class UserResponseModel {
	private String userId;
	private String userName;
	private String email;
	private String mobileNumber;
	private Boolean admin;
	private Boolean confirmed;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public UserResponseModel(String userId, String userName, String email, String mobileNumber, Boolean admin,
			Boolean confirmed) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.admin = admin;
		this.confirmed = confirmed;
	}
	public UserResponseModel() {
		super();
	}
}
