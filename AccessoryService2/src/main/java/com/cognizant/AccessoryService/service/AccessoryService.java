package com.cognizant.AccessoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.AccessoryService.entity.Accessory;
import com.cognizant.AccessoryService.repository.AccessoryRepository;

@Service
public class AccessoryService {

	@Autowired
	AccessoryRepository accRepo;
	
	public List<Accessory> getAccList(){
		List<Accessory> result= accRepo.findAll();
		return result;
		
	}
}
