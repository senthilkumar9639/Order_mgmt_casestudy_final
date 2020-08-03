package com.cognizant.SeriesModelService.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ModelId implements Serializable {

	private static final long serialVersionUID = -5048971899268674216L;

	@Column(name = "CmpCode")
	private String cmpCode;

	@Column(name = "SeriesCode")
	private String seriesCode;

	@Column(name = "modelCode")
	private String modelCode;

}