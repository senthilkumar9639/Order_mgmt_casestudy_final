package com.cognizant.OrderMgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class OrderheaderId implements Serializable{
	
	private static final long serialVersionUID = 6955405411718061831L;

	@Column(name="CmpCode")
	private String cmpCode;
	
	@Column(name="dealerCode")
	private String dealerCode;
	
	@Column(name="SeriesCode")
	private String seriesCode;
	
	@Column(name="ModelCode")
	private String modelCode;
	
	@Column(name="OrderNo")
	private String orderNo;


}