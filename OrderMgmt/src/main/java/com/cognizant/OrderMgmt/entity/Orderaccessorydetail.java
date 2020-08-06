package com.cognizant.OrderMgmt.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Orderaccessorydetail {

	@EmbeddedId
	private OrderaccessorydetailId id;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumns({
		@JoinColumn(name = "OrderNo", referencedColumnName = "OrderNo", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name = "DealerCode", referencedColumnName = "DealerCode", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name = "CmpCode", referencedColumnName = "CmpCode", nullable = false, insertable = false, updatable = false) })
	private Orderheader ordheader1;

}