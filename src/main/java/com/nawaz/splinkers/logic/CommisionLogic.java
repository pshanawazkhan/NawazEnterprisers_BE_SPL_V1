package com.nawaz.splinkers.logic;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommisionLogic {

	
	@Autowired
	AllForms allf ;
	
	
	public Map<String, Object> search(Form form) throws ParseException {
		
		Map<String, Object> m1= new HashMap<>();
		
		
		
		allf.setSparte(form.getSparte());
		allf.setCommisionTo(form.getCommisionTo());
		
		if(form.getDateTo() != null && form.getDateFrom() != null) {
		allf.setDateTo(TextUtil.convertStringToDate(form.getCommisionTo()));
		allf.setDateFrom(TextUtil.convertStringToDate(form.getDateFrom()));
		}
		
		System.out.println(form.getDateTo());
		System.out.println(form.getCommisionFrom());
		
		List<String> commups = form.getCommisionUplode();
		List<String> nationalups = form.getNationalTypeUplode();
		List<String> chassinoups = form.getChassiNoUplode();
		/* logic for CommisionType Uplode*/
		if(commups != null && commups.size() >1) {
			
			allf.setAllcommisionUplode(commups);
			
		}
		
		if(commups != null && commups.size() == 1) {
			
			
			allf.setCommisionFrom(commups.get(0));
			
		}
	
		/* Logic for National Type Uplode */
	
	if(nationalups != null && nationalups.size() > 0 ) {
		
		allf.setAllNationalTypeUplode(nationalups);
		
	}
	
	/* Logic for ChassiNo Uplode */
	
	if(chassinoups != null && chassinoups.size() >0) {
		
	allf.setAllChassiNoUplode(chassinoups);
	}
	
	m1.put("Sparte", allf.getSparte());
	m1.put("DateFrom", allf.getDateTo());
	m1.put("DateTo", allf.getDateTo());
	m1.put("commisionNoTO", allf.getCommisionTo());
	m1.put("commisionNofROM", allf.getCommisionFrom());
	m1.put("uplodeCommisionNo", allf.getAllcommisionUplode());
	m1.put("nationalTypeUplode", allf.getAllNationalTypeUplode());
	m1.put("uplodeChassiNo", allf.getAllChassiNoUplode());
	
	
	return m1;
	}
	
	
	
	
}
