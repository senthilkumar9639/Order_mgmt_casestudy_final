package com.cognizant.OrderMgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class AppuserId implements Serializable{

	private static final long serialVersionUID = 2323842439548124993L;

	@Column(name = "CmpCode")
	private String cmpCode;

	@Column(name = "usercode")
	private String userCode;
}
