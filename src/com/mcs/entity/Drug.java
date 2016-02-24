package com.mcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drugs")
public class Drug {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private double price;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "minorderquantity")
	private int minOrderQuqntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMinorderquqntity() {
		return minOrderQuqntity;
	}

	public void setMinorderquqntity(int minOrderQuqntity) {
		this.minOrderQuqntity = minOrderQuqntity;
	}

}
