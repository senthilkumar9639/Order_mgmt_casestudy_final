package com.cognizant.OrderMgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class UsergroupId implements Serializable{
	private static final long serialVersionUID = -1783203393803241133L;
	
	@Column(name="CmpCode")
	private String cmpCode;
	
	@Column(name="GroupCode")
	private String groupCode;
}