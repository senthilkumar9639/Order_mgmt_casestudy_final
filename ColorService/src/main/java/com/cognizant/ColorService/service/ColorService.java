package com.cognizant.ColorService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ColorService.entity.Colors;
import com.cognizant.ColorService.entity.Model;
import com.cognizant.ColorService.repository.ColorsRepository;

@Service
public class ColorService {

	@Autowired
	ColorsRepository colorrepo;

	public List<Colors> getColors(Model model) {
		return colorrepo.findByIdCmpCodeAndIdSeriesCodeAndIdModelCode(model.getId().getCmpCode(),
				model.getId().getSeriesCode(), model.getId().getModelCode());

	}
}
