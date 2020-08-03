package com.cognizant.AccessoryService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.AccessoryService.entity.Accessory;
import com.cognizant.AccessoryService.service.AccessoryService;

@RestController
@RequestMapping("/accessory")
public class AccessoryServiceController {
	
	@Autowired
	AccessoryService accService;

	@GetMapping("/getAccessories")
	@ResponseBody
	public List<Accessory> getAccessories() {
		return accService.getAccList();
		
	}
}
