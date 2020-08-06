package com.cognizant.OrderMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.OrderMgmt.Repository.OrderheaderRepository;
import com.cognizant.OrderMgmt.entity.Orderheader;

@Service
public class OrdMgmtService {
	
	@Autowired
	private OrderheaderRepository orderRepo;

	public Orderheader saveOrder(Orderheader order) {
		return orderRepo.save(order);
		
	}
}
