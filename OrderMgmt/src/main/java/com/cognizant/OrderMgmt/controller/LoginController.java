package com.cognizant.OrderMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.OrderMgmt.entity.Appuser;
import com.cognizant.OrderMgmt.entity.ReponseModel;
import com.cognizant.OrderMgmt.service.LoginService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<ReponseModel> getLogin(@RequestBody Appuser user) {
		System.out.println("calling Login Controller"+user.toString());
		return new ResponseEntity<>(loginService.getScreen(user),HttpStatus.OK);
		
		
	}

}
