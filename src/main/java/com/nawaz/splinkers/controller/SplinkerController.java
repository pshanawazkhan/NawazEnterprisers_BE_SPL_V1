package com.nawaz.splinkers.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nawaz.splinkers.entity.SplinkerError;
import com.nawaz.splinkers.entity.Splinkers;
import com.nawaz.splinkers.logic.CommisionLogic;
import com.nawaz.splinkers.logic.Form;
import com.nawaz.splinkers.messages.Response;
import com.nawaz.splinkers.messages.ResponseMessage;
import com.nawaz.splinkers.repository.SplinkerRepository;
import com.nawaz.splinkers.services.SplinkersServices;


@RestController
@RequestMapping("/splinkers")
@CrossOrigin("http://localhost:4200")
public class SplinkerController {

	
	@Autowired
	SplinkerRepository splinkerRepository;
	
	@Autowired
	SplinkersServices splinkerServices;
	
	ResponseMessage rm;
	
	Response res;
	
	SplinkerError splerr ;
	
	@PostMapping("/save")
	
	public ResponseEntity<ResponseMessage> addItems(@RequestBody Splinkers spl){
		
		boolean b= splinkerServices.saveItems(spl);
		
		     if(b) {
			
			 rm =new ResponseMessage(res.REQUEST_TYPE_ADD, res.RESPONSE_MESSAGE_SUCESS, res.RESPONSE_MESSAGE_SUCESS, true);
				
				return new ResponseEntity<ResponseMessage>(rm, HttpStatus.ACCEPTED);
		      }
		       else {
			
			     rm = new    ResponseMessage(res.REQUEST_TYPE_ADD, res.RESPONSE_MESSAGE_FAILED, res.RESPONSE_MESSAGE_FAILED, false);
				
				return new ResponseEntity<ResponseMessage>(rm, HttpStatus.BAD_GATEWAY);
			
		       }	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseMessage> deleteItems(@PathVariable int id){
		
		boolean b= splinkerServices.deleteItems(id);
		 
		if(b) {
		
		ResponseMessage rm = new ResponseMessage("Delete","item with id"+id+" deleted","sucess", true);
		return new ResponseEntity<ResponseMessage>(rm,HttpStatus.ACCEPTED);
		
		}else {
			
			ResponseMessage rm = new ResponseMessage("Delete","item with id"+id+"Not Avallable","Failure", false);
			return new ResponseEntity<ResponseMessage>(rm,HttpStatus.BAD_GATEWAY);
			
			
			
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseMessage>  updateItems(@RequestBody Splinkers spl){
		
		boolean b= splinkerServices.updateItems(spl);
		if(b) {
		
		 rm = new ResponseMessage("Update","item with id"+spl.getSplid()+" updates","sucess", true);
		return  new ResponseEntity<ResponseMessage>(rm,HttpStatus.ACCEPTED);
		}
		else {
			ResponseMessage rm = new ResponseMessage("failed","item  failed to update ","failed", false);
			
			return  new ResponseEntity<ResponseMessage>(rm,HttpStatus.BAD_GATEWAY);
			
		}
	}
	
	
	@GetMapping("/get")
	@ResponseBody
	
	public List<Splinkers> getItemsDetails() {
		System.out.println("call from ui is happening ---------------");
		
		List<Splinkers> l1 = splinkerServices.getAllSplinkersItems();
		
		if(l1.size()>0) {
			
			
			return l1;
		}
		else {
			return l1;
			
		}
		
	}
	@GetMapping("/getbyid/{id}")
	@ResponseBody
	public com.nawaz.splinkers.entityObjects.Splinkers getItemsDetailsbyId(@PathVariable int id) {
	
		return splinkerServices.getSplinkersItemsById(id);
		
	}
	@Autowired
	CommisionLogic cl;
	@PostMapping("form")
	
	@ResponseBody
	public Map<String, Object> test(@RequestBody Form f1) {
		
	return	cl.search(f1);
		
	}
	
	
	
	
	
}	
