package com.nawaz.splinkers.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nawaz.splinkers.entity.Splinkers;
import com.nawaz.splinkers.messages.Response;
import com.nawaz.splinkers.messages.ResponseMessage;
import com.nawaz.splinkers.repository.SplinkerRepository;
@Service
public class SplinkersServices {

	
	
	@Autowired
	SplinkerRepository splinkerRepository;
	
ResponseMessage rm;
	
	Response res;
	
	
	public boolean saveItems(Splinkers splinkers) {
		
		
		try {
		splinkerRepository.save(splinkers);
		
		return true;
		}catch(Exception e) {
			
			System.out.println("-----------------Exception Occured at Splinker Services-------------");
			e.printStackTrace();
			return false;
		}
			
		
	}
	
	public boolean deleteItems(int id) {
		
		
		try {
			
			splinkerRepository.deleteById(id);
			
			return true;
		}catch(Exception e) {
			
			
			return false;
			
		}
		
		
	}
	
	public boolean updateItems(Splinkers splinkers) {
		
		
		try {
			
		Splinkers spl= 	splinkerRepository.getOne(splinkers.getSplid());
		spl.setName(splinkers.getName());
		spl.setCprice(splinkers.getCprice());
		splinkerRepository.save(spl);
		
		return true;
			
			
		}catch(Exception e) {
			
			System.out.println("------------------------error occured in splinker service update");
			
			return false;
		}
		
		
		
		
	}
	
	public List<Splinkers> getAllSplinkersItems() {
		
		List<Splinkers> l1;
		try {
			
			l1= splinkerRepository.findAll();
			
			return l1;
		}
		catch(Exception e) {
			
			System.out.println("Exception Occured in Splinker Services getAllSplinkerItems");
			l1= new ArrayList<>();
			
			
			return l1;
			
		}
		
	}
	
	public com.nawaz.splinkers.entityObjects.Splinkers getSplinkersItemsById(int id) {
		com.nawaz.splinkers.entityObjects.Splinkers s1=null;
		Splinkers spl;
		
		try {
			 spl = splinkerRepository.getOne(id);
			
			System.out.println(spl.getSplid()+"    ------------"+spl.getName());
			s1= new com.nawaz.splinkers.entityObjects.Splinkers();
			
			s1.setId(spl.getSplid());
			s1.setName(spl.getName());
	        s1.setCprice(spl.getCprice());
			
			return s1;
			}catch(Exception e) {
				System.out.println("-------------------------------------------------");
				s1 = new com.nawaz.splinkers.entityObjects.Splinkers();
				String str ="Data With given id "+id+"  not avallable";
			    s1.setMessage(str);
			    s1.setType(false);
			    s1.setId(id);
				
			System.out.println(s1.getMessage()+" --------------  "+s1.getType());
			 
				return s1;
				
			}
		
		
		
	}
	
	
	
	
}
