package com.cognizant.SeriesModelService.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class SeriesId implements Serializable {

	private static final long serialVersionUID = -1287929841789249465L;

	@Column(name = "CmpCode")
	private String cmpCode;

	@Column(name = "SeriesCode")
	private String seriesCode;
	
}
