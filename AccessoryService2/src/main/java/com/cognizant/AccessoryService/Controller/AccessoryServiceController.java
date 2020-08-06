package com.cognizant.AccessoryService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.AccessoryService.entity.Accessory;
import com.cognizant.AccessoryService.entity.Model;
import com.cognizant.AccessoryService.service.AccessoryService;

@RestController
@RequestMapping("/accessory")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccessoryServiceController {
	
	@Autowired
	AccessoryService accService;

	@PostMapping("/getAccessories")
	@ResponseBody
	public List<Accessory> getAccessories(@RequestBody Model model) {
		return accService.getAccList(model);
		
	}
}
