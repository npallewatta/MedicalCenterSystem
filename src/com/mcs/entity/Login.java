package com.mcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	
	public static final String ADMINISTRATOR = "admin";
	public static final String DOCTOR = "doctor";
	public static final String RECEPTIONIST = "receptionist";
	public static final String OTHER = "other";
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;	
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
