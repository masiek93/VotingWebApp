package com.topyfi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RandomUser {
	@Id
	private String userLogin;
	private String userPassword;
	
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
}
