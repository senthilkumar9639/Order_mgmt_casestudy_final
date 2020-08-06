package com.cognizant.OrderMgmt.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.OrderMgmt.Repository.OrderheaderRepository;
import com.cognizant.OrderMgmt.entity.Orderheader;

@Service
public class OrdMgmtService {
	
	@Autowired
	private OrderheaderRepository orderRepo;

	public Orderheader saveOrder(Orderheader order) {
		String uniqueID = UUID.randomUUID().toString();
		order.getId().setOrderNo(uniqueID);
		order.getAccDetails().forEach(e->e.getId().setOrderNo(uniqueID));
		order.getOrdDetails().forEach(e->e.getId().setOrderNo(uniqueID));
		return orderRepo.save(order);
		
	}
}
