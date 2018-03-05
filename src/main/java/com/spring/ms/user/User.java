package com.spring.ms.user;

public class User {
	private int userId;
	private String name;
	private String city;
	
	public User() {
		
	}
	
	public User(int userId, String name, String city) {
		this.userId = userId;
		this.name = name;
		this.city = city;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "User Id: " + getUserId() + "\tName: " + getName() + "\tCity: " + getCity();
	}
}
