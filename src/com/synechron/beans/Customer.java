package com.synechron.beans;

public class Customer {
	
	
	public Customer() {
		super();
		customerIdStatic++;
		setCustomerId(customerIdStatic);
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	private int customerId;
	private String name;	
	private long phoneNo;
	private String address;
	
	private static int customerIdStatic = 101;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId+ ", name="
				+ name + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}
	
	
	
}
