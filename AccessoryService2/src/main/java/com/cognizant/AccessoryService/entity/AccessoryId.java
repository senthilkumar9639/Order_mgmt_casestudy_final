
package com.cognizant.AccessoryService.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccessoryId implements Serializable{
	
	private static final long serialVersionUID = -8501235951026907483L;

	@Column(name="CmpCode")
	private String cmpCode;
	
	@Column(name="SeriesCode")
	private String seriesCode;
	
	@Column(name="ModelCode")
	private String modelCode;
	
	@Column(name="AccessoryCode")
	private String accessoryCode;

}
