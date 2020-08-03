package com.cognizant.OrderMgmt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Orderheader {
	
	@EmbeddedId
	private OrderheaderId id;
	
	@Column(name="OrderDt")
	private Date orderDt;
	
	@Column(name="OrderValue")
	private double orderValue;

}