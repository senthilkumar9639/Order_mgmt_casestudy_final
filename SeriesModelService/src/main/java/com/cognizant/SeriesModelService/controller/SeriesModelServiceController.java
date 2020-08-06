package com.cognizant.SeriesModelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SeriesModelService.entity.Model;
import com.cognizant.SeriesModelService.entity.Series;
import com.cognizant.SeriesModelService.service.SerriesModelService;

@RestController
@RequestMapping("/series&model")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SeriesModelServiceController {
	
	@Autowired
	private SerriesModelService smService;

	@GetMapping("/getSeries")
	public @ResponseBody List<Series> getSeries() {
		return smService.getSeriesList();
		
	}
	@PostMapping("/getModel")
	public @ResponseBody List<Model> getModel(@RequestBody Series series) {
		return smService.getModeList(series);
		
	}
	
}
