package com.cognizant.OrderMgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author senthilkumarramalingam
 *
 */
@Entity
@Data
public class Company implements Serializable {

	private static final long serialVersionUID = -8084833871893031062L;

	@Id
	@Column(name = "CmpCode")
	private String cmpCode;

	@Column(name = "CmpName")
	private String cmpName;

	@Column(name = "city")
	private String city;

	@Column(name = "CmpState")
	private String CmpState;

	@Column(name = "Country")
	private String Country;

	@Column(name = "PostalCode")
	private int PostalCode;
}