package com.einfo.demotesting.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memeber {
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Memeber [email=" + email + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + "]";
	}
	
	public Memeber(String email, String name, String mobile, String gender) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
	}

	public Memeber() {
		super();
	}
	private String email;
	private String name;
	private String mobile;
	private String gender;
}

