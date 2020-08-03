package com.cognizant.ColorService.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity

public class Colors {

	@EmbeddedId
	private ColorsId id;

	@Column(name = "ColorName")
	private String colorName;

	@Column(name = "Price")
	private double price;
}
