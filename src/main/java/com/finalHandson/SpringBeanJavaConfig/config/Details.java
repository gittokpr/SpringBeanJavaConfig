package com.finalHandson.SpringBeanJavaConfig.config;

public class Details {
	private String Name;
	private int age;
	public Address address;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", age=" + age + ", address=" + address + "]";
	}
}
