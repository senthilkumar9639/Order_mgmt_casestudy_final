
package com.cognizant.AccessoryService.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Accessory {
	
	@EmbeddedId
	private AccessoryId id;
	
	@Column(name="AccessoryName")
	private String accessoryName;
	
	@Column(name="Price")
	private double price;
}
