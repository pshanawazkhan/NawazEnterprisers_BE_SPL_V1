package com.nawaz.splinkers.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CommisionLogic {

	
	
	
	
	public Map<String, Object> search(Form form) {
		
		Map<String, Object> m1= new HashMap<>();
		
		AllForms allf = new AllForms();
		
		allf.setSparte(form.getSparte());
		allf.setCommisionTo(form.getCommisionTo());
		
		List<String> commups = form.getCommisionUplode();
		
		if(commups != null && commups.size() >1) {
			
			allf.setAllcommisionUplode(commups);
			
		}
		
		if(commups != null && commups.size() == 1) {
			
			
			allf.setCommisionFrom(commups.get(0));
			
		}
		m1.put("Sparte", allf.getSparte());
		m1.put("commision No TO", allf.getCommisionTo());
		m1.put("commision No fROM", allf.getCommisionFrom());
		m1.put("uplode Commision No", allf.getAllcommisionUplode());
		
		
		return m1;
	}
	
	
	
	
	
	
	
	
	
}
