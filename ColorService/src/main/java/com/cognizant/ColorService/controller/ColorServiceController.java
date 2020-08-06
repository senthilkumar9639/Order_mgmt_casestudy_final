package com.cognizant.ColorService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ColorService.entity.Colors;
import com.cognizant.ColorService.entity.Model;
import com.cognizant.ColorService.service.ColorService;

@RestController
@RequestMapping("/colors")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ColorServiceController {

	@Autowired
	ColorService colorService;
	
	@PostMapping("/getColors")
	public @ResponseBody List<Colors> getColors(@RequestBody Model model) {
		return colorService.getColors(model);
		
	}
}
