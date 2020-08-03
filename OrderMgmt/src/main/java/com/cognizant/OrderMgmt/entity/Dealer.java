package com.cognizant.OrderMgmt.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Dealer {
	@EmbeddedId
	private DealerId id;
	
	@Column(name="DealerName")
	private String dealerName;
}
