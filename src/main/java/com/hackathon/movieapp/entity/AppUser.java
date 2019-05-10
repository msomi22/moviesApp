/**
 * 
 */
package com.hackathon.movieapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author t_pnjeru
 *
 */
@Entity
public class AppUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	private String name;
	private String email;
	private String username;
	private String appPassword;
	private String appUsername;
	private Date lastUpdatedOn;
	private Date creadtedOn;
	

	/**
	 * 
	 */
	public AppUser(String name,String email,String username,String appPassword,String appUsername) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.appPassword = appPassword;
		this.appUsername = appUsername;
		lastUpdatedOn = new Date(System.currentTimeMillis());
		creadtedOn = new Date(System.currentTimeMillis());
	}


	@Override
	public String toString() {
		return "AppUser [id=" + id + ", name=" + name + ", email=" + email + ", username=" + username + ", appPassword="
				+ appPassword + ", appUsername=" + appUsername + ", lastUpdatedOn=" + lastUpdatedOn + ", creadtedOn="
				+ creadtedOn + "]";
	}

}
