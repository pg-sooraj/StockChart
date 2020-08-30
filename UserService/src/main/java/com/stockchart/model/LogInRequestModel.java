package com.stockchart.model;

public class LogInRequestModel {
	
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LogInRequestModel(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public LogInRequestModel() {
		super();
	}
}
