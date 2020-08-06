package com.cognizant.OrderMgmt.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Orderheader {

	@EmbeddedId
	private OrderheaderId id;
	
	@Column(name = "SeriesCode")
	private String seriesCode;

	@Column(name = "ModelCode")
	private String modelCode;

	@Column(name = "OrderDt")
	private Date orderDt;

	@Column(name = "OrderValue")
	private double orderValue;

	@OneToMany(mappedBy = "ordheader1",orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<Orderaccessorydetail> accDetails;

	@OneToMany(mappedBy = "ordheader2",orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<Orderdetail> ordDetails;

}