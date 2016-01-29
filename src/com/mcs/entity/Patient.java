package com.mcs.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Table(name = "patient")
public class Patient {

	@javax.persistence.Id
	@GeneratedValue
	@Column(name = "patient_id")
	private int Id;

	@Column(name = "patient_nic")
	private String NIC;

	@Column(name = "patient_firstname")
	private String firstName;

	@Column(name = "patient_secondname")
	private String secondName;

	@Column(name = "patient_age")
	private int age;

	@Column(name = "patient_telephone")
	private int telepone;

	@Column(name = "patient_address")
	private String address;

	@Column(name = "patient_details")
	private String details;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTelepone() {
		return telepone;
	}

	public void setTelepone(int telepone) {
		this.telepone = telepone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
