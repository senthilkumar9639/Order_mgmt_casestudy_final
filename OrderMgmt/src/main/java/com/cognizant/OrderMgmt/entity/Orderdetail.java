package com.cognizant.OrderMgmt.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Orderdetail {

	@EmbeddedId
	private OrderdetailId id;

	@Column(name = "TotalOrdQty")
	private int totalOrdQty;

	@Column(name = "TotalAccQty")
	private int totalAccQty;

	@Column(name = "OrderBaseAmount")
	private double orderBaseAmount;

	@Column(name = "OrderAccesoryAmount")
	private double orderAccesoryAmount;

	@Column(name = "OrderTotalAmount")
	private double orderTotalAmount;

}