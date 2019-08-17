package com.nawaz.splinkers.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Splinkers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Splinkers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="splid")
	private int splid;
	@Column(name="name")
	private String name;
	@Column(name="cprice")
	private int cprice;
	
	public Splinkers() {
		
		
	}

	public Splinkers(int splid, String name, int cprice) {
		this.splid = splid;
		this.name = name;
		this.cprice = cprice;
	}
	public Splinkers( String name, int cprice) {
		
		this.name = name;
		this.cprice = cprice;
	}

	public int getSplid() {
		return splid;
	}

	public void setSplid(int splid) {
		this.splid = splid;
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
