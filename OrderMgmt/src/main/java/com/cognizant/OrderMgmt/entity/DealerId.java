package com.cognizant.OrderMgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class DealerId implements Serializable{
	
	private static final long serialVersionUID = -6388507925139630619L;

	@Column(name="CmpCode")
	private String cmpCode;
	
	@Column(name="dealerCode")
	private String dealerCode;
}
