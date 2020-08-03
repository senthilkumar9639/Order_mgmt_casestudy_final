package com.cognizant.SeriesModelService.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Series {

	@EmbeddedId
	private SeriesId id;

	@Column(name = "SeriesName")
	private String seriesName;
}
