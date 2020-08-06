package com.cognizant.ColorService.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Model {
	
	@EmbeddedId
	private ModelId id;
	
	@Column(name="ModelName")
	private String modelName;
	
	@Column(name="ModelPrice")
	private double modelPrice;
}