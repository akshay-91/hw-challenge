package com.honeywell.employyelocationtracker.dto;

import org.springframework.data.annotation.Id;

public class FloorDTO {

@Id
private Integer floorId;

private String floorName;

public Integer getFloorId() {
	return floorId;
}

public void setFloorId(Integer floorId) {
	this.floorId = floorId;
}

public String getFloorName() {
	return floorName;
}

public void setFloorName(String floorName) {
	this.floorName = floorName;
}

	
}
