package com.nawaz.splinkers.test.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.ExcludeSuperclassListeners;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.nawaz.splinkers.entity.Splinkers;
import com.nawaz.splinkers.repository.SplinkerRepository;
import com.nawaz.splinkers.services.SplinkersServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SplinkerServicesTest {
	
	@Autowired
	SplinkersServices splServices;
	
	@MockBean
	SplinkerRepository splRepository;
	
	@Test
	public void testGetAllSplinkersItems() {
		
		
		when(splRepository.findAll()).thenReturn(
				
				Stream.of(new Splinkers(1, "nozzle", 45),
						  new Splinkers(2, "rgtuur", 55)
						  ).collect(Collectors.toList())
				
				);
		
		assertEquals(2, splServices.getAllSplinkersItems().size());
		
		
	}
	
	@Test
	public void saveItemsTest() {
	
		
		Splinkers s1 = new Splinkers( "RazerPipe", 75);
		splServices.saveItems(s1);
	    verify(splRepository, times(1)).save(s1);
	}
	@Test
	public void deleteItemTest() {
		Splinkers s1 = new Splinkers("ssss", 4545);
		
		splServices.deleteItems(45);
		verify(splRepository,times(1)).deleteById(45);
		
		
	}
	
	@Test
	public void updateItems() {
		
		Splinkers s1 = new Splinkers(1,"abc",45);
boolean b= 		splServices.updateItems(s1);
		

		assertEquals(false, b);
		
	}
	
	@Test
	public void getSplinkersItemsById() {
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
