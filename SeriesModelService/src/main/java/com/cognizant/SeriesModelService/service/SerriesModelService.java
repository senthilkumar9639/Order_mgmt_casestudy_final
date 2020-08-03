package com.cognizant.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.SeriesModelService.entity.Model;
import com.cognizant.SeriesModelService.entity.Series;
import com.cognizant.SeriesModelService.repository.ModelRepository;
import com.cognizant.SeriesModelService.repository.SeriesRepository;

@Service
public class SerriesModelService {

	@Autowired
	private ModelRepository modelRepo;
	
	@Autowired
	private SeriesRepository seriesRepo;
	
	public List<Series> getSeriesList(){
		return seriesRepo.findAll();
		
	}
	
	public List<Model> getModeList(){
		return modelRepo.findAll();
		
	}
	
}
