package com.einfochips.demomongodb.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Trainee {
	
	@Id
	private int id;
	private String traineename;
	private String location;
	
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", traineename=" + traineename + ", location=" + location + "]";
	}

	
	
	public Trainee() {
		super();
	}

	
	public Trainee(int id, String traineename, String location) {
		super();
		this.id = id;
		this.traineename = traineename;
		this.location = location;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraineename() {
		return traineename;
	}
	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
