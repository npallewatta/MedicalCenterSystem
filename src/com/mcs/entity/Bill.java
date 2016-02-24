package com.mcs.entity;

public class Bill {
	
	private int billID;
	private Items[] billItems;
	private int subTotal;
	private String billDate;
	public int getBillID() {
		return billID;
	}
	public void setBillID(int billID) {
		this.billID = billID;
	}
	public Items[] getBillItems() {
		return billItems;
	}
	public void setBillItems(Items[] billItems) {
		this.billItems = billItems;
	}
	public int getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

}
