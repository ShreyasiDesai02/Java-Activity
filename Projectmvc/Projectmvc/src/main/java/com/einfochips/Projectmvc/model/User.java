package com.einfochips.Projectmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class User {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", address=" + address + ", mobile=" + mobile + "]";
	}
	public User(String name, String email, String address, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}
	
	private String name;
	@Id
	private String email;
	private String address;
	private String mobile;
}
