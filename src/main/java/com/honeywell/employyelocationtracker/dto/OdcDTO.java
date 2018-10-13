package com.honeywell.employyelocationtracker.dto;

import org.springframework.data.annotation.Id;

public class OdcDTO {

@Id
private Integer odcId;

private String odcName;

public Integer getOdcId() {
	return odcId;
}

public void setOdcId(Integer odcId) {
	this.odcId = odcId;
}

public String getOdcName() {
	return odcName;
}

public void setOdcName(String odcName) {
	this.odcName = odcName;
}

	
}
