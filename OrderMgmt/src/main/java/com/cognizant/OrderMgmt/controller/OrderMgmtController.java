package com.cognizant.OrderMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")

public class OrderMgmtController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/getCompany")
	public int getCompany() {
		return jdbcTemplate.queryForObject("SELECT count(*) FROM company", Integer.class);
	}
}
