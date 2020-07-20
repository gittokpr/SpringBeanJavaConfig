package com.finalHandson.SpringBeanJavaConfig.config;

public class Address {
	private String houseNumber;
	private String city;
	private String State;
	private int pincode;
	
	public Address(String houseNumber, String city, String state, int pincode) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", State=" + State + ", pincode=" + pincode
				+ "]";
	}
}
