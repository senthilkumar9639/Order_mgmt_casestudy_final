package com.cognizant.OrderMgmt.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	@JoinColumns({
			@JoinColumn(name = "OrderNo", referencedColumnName = "OrderNo", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "DealerCode", referencedColumnName = "DealerCode", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CmpCode", referencedColumnName = "CmpCode", nullable = false, insertable = false, updatable = false) })

	private Orderheader ordheader2;

}