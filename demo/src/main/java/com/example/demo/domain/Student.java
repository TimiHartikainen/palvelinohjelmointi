package com.example.demo.domain;

public class Student {
	private String firtsName;
	private String lastName;
	private String email;
	
	public String getFirtsName() {
		return firtsName;
	}
	
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student(String firtsName, String lastName, String email) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Message [firtsName=" + firtsName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}