package com.cognizant.OrderMgmt.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Usergroup{
	@EmbeddedId
	private UsergroupId id;
	private String GroupName;

}