package com.mcs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.xml.internal.ws.developer.Serialization;

@Entity
@Table(name = "patientdetails")
public class PatientDetails implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "patientdetail_firstname")
	private String firstName;
	
	@Column(name = "patientdetail_surname")
	private String surName;
	
	@Column(name = "patientdetail_telephone")
	private String telephone;
	
	@Column(name = "patientdetail_address")
	private String address;
	
	@Column(name = "patientdetail_age")
	private int age;

	@Column(name = "patientdetail_description")
	private String description;

	@Column(name = "patientdetail_date")
	private String descriptionDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionDate() {
		return descriptionDate;
	}

	public void setDescriptionDate(String descriptionDate) {
		this.descriptionDate = descriptionDate;
	}
}
