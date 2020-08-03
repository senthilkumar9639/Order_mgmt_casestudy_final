package com.cognizant.OrderMgmt.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Appuser {
	@EmbeddedId
	private AppuserId id;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "UserPwd")
	private String userPwd;
	
	@Column(name = "GroupCode")
	private String groupCode;
}
