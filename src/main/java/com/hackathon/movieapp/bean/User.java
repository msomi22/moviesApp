package com.hackathon.movieapp.bean;

public class User {
	
	private String name;
	private String email;
	private String username;
	private String appPassword;
	private String appUsername;

	public User() {
		name = "";
		email = "";
		username = "";
		appPassword = "";
		appUsername = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAppPassword() {
		return appPassword;
	}

	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}

	public String getAppUsername() {
		return appUsername;
	}

	public void setAppUsername(String appUsername) {
		this.appUsername = appUsername;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", username=" + username + ", appPassword=" + appPassword
				+ ", appUsername=" + appUsername + "]";
	}

}
