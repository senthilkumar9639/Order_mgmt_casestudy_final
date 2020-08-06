package com.cognizant.AccessoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.AccessoryService.entity.Accessory;
import com.cognizant.AccessoryService.entity.Model;
import com.cognizant.AccessoryService.repository.AccessoryRepository;

@Service
public class AccessoryService {

	@Autowired
	AccessoryRepository accRepo;

	public List<Accessory> getAccList(Model model) {
		return accRepo.findByIdCmpCodeAndIdSeriesCodeAndIdModelCode(model.getId().getCmpCode(),
				model.getId().getSeriesCode(), model.getId().getModelCode());

	}
}
