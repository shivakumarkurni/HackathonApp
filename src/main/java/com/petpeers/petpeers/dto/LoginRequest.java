package com.petpeers.petpeers.dto;

import lombok.Data;

@Data
public class LoginRequest {

	private String userName;
	private String  userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
