package com.cognizant.OrderMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.OrderMgmt.entity.Orderheader;
import com.cognizant.OrderMgmt.service.OrdMgmtService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderMgmtController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private OrdMgmtService orderService;

	@GetMapping("/getCompany")
	public int getCompany() {
		return jdbcTemplate.queryForObject("SELECT count(*) FROM company", Integer.class);
	}
	
	@PostMapping("/saveOrder")
	public ResponseEntity<Orderheader> saveOrder(Orderheader order) {
		Orderheader response = orderService.saveOrder(order);
		return new ResponseEntity<>(response,HttpStatus.OK);		
	}
}
