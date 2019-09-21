package com.nawaz.splinkers.logic;

import java.util.Date;
import java.util.List;


public class Form {

	
	private String sparte;
	
	private String commisionTo;
	
	private String commisionFrom;
	
	private Date dateTo;
	
	private Date dateFrom;
	
	private List<String> commisionUplode;
	
	private List<String> nationalTypeUplode;
	
	private List<String> chassiNoUplode;

	public String getSparte() {
		return sparte;
	}

	public void setSparte(String sparte) {
		this.sparte = sparte;
	}

	public String getCommisionTo() {
		return commisionTo;
	}

	public void setCommisionTo(String commisionTo) {
		this.commisionTo = commisionTo;
	}

	public String getCommisionFrom() {
		return commisionFrom;
	}

	public void setCommisionFrom(String commisionFrom) {
		this.commisionFrom = commisionFrom;
	}

	public List<String> getCommisionUplode() {
		return commisionUplode;
	}

	public void setCommisionUplode(List<String> commisionUplode) {
		this.commisionUplode = commisionUplode;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public List<String> getNationalTypeUplode() {
		return nationalTypeUplode;
	}

	public void setNationalTypeUplode(List<String> nationalTypeUplode) {
		this.nationalTypeUplode = nationalTypeUplode;
	}

	public List<String> getChassiNoUplode() {
		return chassiNoUplode;
	}

	public void setChassiNoUplode(List<String> chassiNoUplode) {
		this.chassiNoUplode = chassiNoUplode;
	}
	
	
	
	
	
	
}





