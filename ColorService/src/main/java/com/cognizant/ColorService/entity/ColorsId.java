package com.cognizant.ColorService.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ColorsId implements Serializable{

	private static final long serialVersionUID = -4329280397512391509L;

	@Column(name = "CmpCode")
	private String cmpCode;

	@Column(name = "SeriesCode")
	private String seriesCode;

	@Column(name = "modelCode")
	private String modelCode;
	
	@Column(name = "ColorCode")
	private String colorCode;

}
