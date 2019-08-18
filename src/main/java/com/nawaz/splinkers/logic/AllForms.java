package com.nawaz.splinkers.logic;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AllForms {

	
	private String sparte;
	
	private Date dateTo;
	
	private Date dateFrom;
	
	private String commisionTo;
	
	private String commisionFrom;
	
	private List<String> AllcommisionUplode;
	
	private List<String> AllNationalTypeUplode;
	
	private List<String> AllChassiNoUplode;

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

	public List<String> getAllcommisionUplode() {
		return AllcommisionUplode;
	}

	public void setAllcommisionUplode(List<String> allcommisionUplode) {
		AllcommisionUplode = allcommisionUplode;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public List<String> getAllNationalTypeUplode() {
		return AllNationalTypeUplode;
	}

	public void setAllNationalTypeUplode(List<String> allNationalTypeUplode) {
		AllNationalTypeUplode = allNationalTypeUplode;
	}

	public List<String> getAllChassiNoUplode() {
		return AllChassiNoUplode;
	}

	public void setAllChassiNoUplode(List<String> allChassiNoUplode) {
		AllChassiNoUplode = allChassiNoUplode;
	}
	
	
	
	
}
