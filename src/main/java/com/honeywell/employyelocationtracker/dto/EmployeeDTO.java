package com.honeywell.employyelocationtracker.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EmployeeDTO {

private Integer employeeId;

private String employeeName;

private Integer odcNumber;

private Integer userType;

public Integer getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public Integer getOdcNumber() {
	return odcNumber;
}

public void setOdcNumber(Integer odcNumber) {
	this.odcNumber = odcNumber;
}

public Integer getUserType() {
	return userType;
}

public void setUserType(Integer userType) {
	this.userType = userType;
}

@Override
public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, false);
}

@Override
public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
}

@Override
public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
}

	
}
