package com.cognizant.OrderMgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class OrderaccessorydetailId implements Serializable {

	private static final long serialVersionUID = -4902595884736256718L;

	@Column(name = "CmpCode")
	private String cmpCode;

	@Column(name = "DealerCode")
	private String dealerCode;

	@Column(name = "OrderNo")
	private String orderNo;

	@Column(name = "AccessoryCode")
	private String accessoryCode;

}