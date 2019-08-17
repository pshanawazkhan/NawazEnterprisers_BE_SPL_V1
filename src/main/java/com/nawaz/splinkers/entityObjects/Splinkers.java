package com.nawaz.splinkers.entityObjects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

@JsonFormat
@JsonIgnoreProperties
@JsonAppend
public class Splinkers {

	private int id;
	
	private String name;
	
	private int cprice;
	
	private String message;
	
	private boolean type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public Splinkers() {
		
		
	}

	public Splinkers(String message, boolean type) {
	
		this.message = message;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	
	
}
