package com.cognizant.ColorService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ColorService.entity.Colors;
import com.cognizant.ColorService.repository.ColorsRepository;


@Service
public class ColorService {
	
	@Autowired
	ColorsRepository colorrepo;

	public List<Colors> getColors(){
		return colorrepo.findAll();
		
	}
}
