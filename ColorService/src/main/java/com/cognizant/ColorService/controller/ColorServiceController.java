package com.cognizant.ColorService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ColorService.entity.Colors;
import com.cognizant.ColorService.service.ColorService;

@RestController
@RequestMapping("/colors")
public class ColorServiceController {

	@Autowired
	ColorService colorService;
	
	@GetMapping("/getColors")
	public @ResponseBody List<Colors> getColors() {
		return colorService.getColors();
		
	}
}
